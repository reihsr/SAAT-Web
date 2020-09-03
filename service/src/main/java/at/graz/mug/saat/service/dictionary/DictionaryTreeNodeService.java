package at.graz.mug.saat.service.dictionary;

import at.graz.mug.saat.dao.directory.DictionaryTreeEdgeRepository;
import at.graz.mug.saat.dao.directory.DictionaryTreeNodeRepository;
import at.graz.mug.saat.model.dictionary.DictionaryTreeEdge;
import at.graz.mug.saat.model.dictionary.DictionaryTreeNode;
import at.graz.mug.saat.util.cache.DirectoryCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class DictionaryTreeNodeService {

    private final DictionaryTreeNodeRepository node_repository;
    private final DictionaryTreeEdgeRepository link_repository;

    DirectoryCache directoryCache = null;

    public DictionaryTreeNodeService(DictionaryTreeNodeRepository node_repository, DictionaryTreeEdgeRepository link_repository ) {
        this.node_repository = node_repository;
        this.link_repository = link_repository;
    }

    @PostConstruct
    public void initDictionaryTreeNode() {
        directoryCache = DirectoryCache.getInstance(node_repository, link_repository);
    }

    public List<DictionaryTreeNode> getDictionaryTreeNodes() {
        return directoryCache.getRootNodes();
    }

    public List<DictionaryTreeNode> getDictionaryTreeNodes(String startswith) {
        return directoryCache.getRootNodes(startswith);
    }

    public List<DictionaryTreeNode> getDictionaryTreeNodes(Integer parentId) {
        return directoryCache.getChildNodes(parentId);
    }
}
