package at.graz.mug.saat.service.dictionary;

import at.graz.mug.saat.dao.directory.DictionaryTreeEdgeRepository;
import at.graz.mug.saat.model.dictionary.DictionaryTreeEdge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DictionaryTreeEdgeService {

    @Autowired
    private DictionaryTreeEdgeRepository repository;

    @PostConstruct
    public void initDictionaryTreeEdge() {
    }

    public List<DictionaryTreeEdge> getDictionaryTreeEdges() {
        return repository.findAll();
    }

}
