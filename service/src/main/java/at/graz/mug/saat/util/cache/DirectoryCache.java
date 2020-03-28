package at.graz.mug.saat.util.cache;

import at.graz.mug.saat.dao.directory.DictionaryTreeEdgeRepository;
import at.graz.mug.saat.dao.directory.DictionaryTreeNodeRepository;
import at.graz.mug.saat.model.dictionary.DictionaryTreeEdge;
import at.graz.mug.saat.model.dictionary.DictionaryTreeNode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class DirectoryCache {

    private static DirectoryCache directoryCache = null;

    private HashMap<Integer, DictionaryTreeNode> root_nodes = new HashMap<Integer, DictionaryTreeNode>();
    private HashMap <Integer, DictionaryTreeNode> childe_nodes = new HashMap<Integer, DictionaryTreeNode>();

    private DictionaryTreeNodeRepository node_repository;
    private DictionaryTreeEdgeRepository link_repository;

    private boolean tree_init = false;

    public DirectoryCache(DictionaryTreeNodeRepository node_repository, DictionaryTreeEdgeRepository link_repository) {
        this.node_repository = node_repository;
        this.link_repository = link_repository;
        if(tree_init == false) {
            tree_init = true;
            initDirectoryCache();
        }
    }

    private DirectoryCache() {

    }

    public static DirectoryCache getInstance(DictionaryTreeNodeRepository node_repository, DictionaryTreeEdgeRepository link_repository) {
        if(directoryCache == null) {
            directoryCache = new DirectoryCache(node_repository, link_repository);
        }
        return directoryCache;
    }

    public List<DictionaryTreeNode> getRootNodes() {
        return new ArrayList<DictionaryTreeNode>(root_nodes.values());
    }

    private void initDirectoryCache() {
        try {
            List<DictionaryTreeNode> root_nodes_list = node_repository.findByRoot(true);
            for (DictionaryTreeNode root_node : root_nodes_list) {
                root_node.addChild(recursiveBuildTree(root_node.getDictionaryId()));
                root_nodes.put(root_node.getDictionaryId(), root_node);
            }
        } catch (Exception ex) {
            System.err.println("Error Creating directory.");
            ex.printStackTrace();
        }
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
