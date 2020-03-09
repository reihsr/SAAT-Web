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
        repository.saveAll(Stream.of
                (new DictionaryTreeNode(1, "root", 0, 0, true, false, true, false, true, false, true, "", "", "", false, 5),
                        new DictionaryTreeNode(2, "123", 0, 0, false, true, true, false, true, false, true, "", "ICD10", "C80.0", false, 5)
                ).collect(Collectors.toList()));
    }

    public List<DictionaryTreeNode> getDictionaryTreeNode() {
        return repository.findAll();
    }
}
