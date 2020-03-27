package at.graz.mug.saat.util.cache;

import at.graz.mug.saat.dao.directory.DictionaryTreeEdgeRepository;
import at.graz.mug.saat.dao.directory.DictionaryTreeNodeRepository;
import at.graz.mug.saat.model.dictionary.DictionaryTreeEdge;
import at.graz.mug.saat.model.dictionary.DictionaryTreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class DirectoryCache {

    private static DirectoryCache directoryCache = null;

    private HashMap<Integer, DictionaryTreeNode> root_nodes = new HashMap<Integer, DictionaryTreeNode>();
    private HashMap <Integer, DictionaryTreeNode> childe_nodes = new HashMap<Integer, DictionaryTreeNode>();

    @Autowired
    private DictionaryTreeNodeRepository node_repository;
    @Autowired
    private DictionaryTreeEdgeRepository link_repository;

    @PostConstruct
    public void initDirectoryCache() {
        if(directoryCache == null) {
            directoryCache = new DirectoryCache();
        }
    }

    private DirectoryCache() {
        try {
            List<DictionaryTreeNode> root_nodes_list = node_repository.findByRoot(true);
            for (DictionaryTreeNode root_node : root_nodes_list) {
                root_node.addChild(recursiveBuildTree(root_node.getDictionaryId()));
            }
        } catch (Exception ex) {
            System.err.println("Error Creating directory.");
            ex.printStackTrace();
        }
    }

    public static DirectoryCache getInstance() {
        if(directoryCache == null) {
            directoryCache = new DirectoryCache();
        }
        return directoryCache;
    }

    public List<DictionaryTreeNode> getRootNodes() {
        return (List<DictionaryTreeNode>) root_nodes.values();
    }

    private List<Integer> recursiveBuildTree(Integer dictionaryId) {
        List<Integer> childeNodes = new ArrayList<Integer>();
        List<DictionaryTreeEdge> links = link_repository.findByDictionaryid(dictionaryId);
        for (DictionaryTreeEdge link : links) {
            try {
                DictionaryTreeNode node = node_repository.getOne(link.getChildDictionaryId());
                node.addChild(recursiveBuildTree(node.getDictionaryId()));
                childe_nodes.put(node.getDictionaryId(), node);
                childeNodes.add(node.getDictionaryId());
            } catch (Exception ex) {
                System.err.println("Error Creating directory recursive. dictionaryId:" + dictionaryId);
                ex.printStackTrace();
            }
        }
        return childeNodes;
    }
}
