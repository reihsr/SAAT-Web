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

    @Autowired
    private DictionaryTreeNodeRepository node_repository;
    @Autowired
    private DictionaryTreeEdgeRepository link_repository;

    DirectoryCache directoryCache = null;

    @PostConstruct
    public void initDictionaryTreeNode() {
        directoryCache = DirectoryCache.getInstance();
    }

    public List<DictionaryTreeNode> getDictionaryTreeNodes() {
        return directoryCache.getRootNodes();
    }
}
