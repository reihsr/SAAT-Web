package at.graz.mug.saat.service.dictionary;

import at.graz.mug.saat.dao.directory.DictionaryTreeNodeRepository;
import at.graz.mug.saat.model.dictionary.DictionaryTreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DictionaryTreeNodeService {

    @Autowired
    private DictionaryTreeNodeRepository repository;

    @PostConstruct
    public void initDictionaryTreeNode() {
        //Initialize Directory
    }

    public List<DictionaryTreeNode> getDictionaryTreeNodes() {
        return repository.findAll();
    }
}
