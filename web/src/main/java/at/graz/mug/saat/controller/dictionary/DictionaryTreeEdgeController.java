package at.graz.mug.saat.controller.dictionary;

import at.graz.mug.saat.model.dictionary.DictionaryTreeEdge;
import at.graz.mug.saat.service.dictionary.DictionaryTreeEdgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DictionaryTreeEdgeController {

    @Autowired
    private DictionaryTreeEdgeService service;

    @GetMapping("dictionarytreeedges")
    public List<DictionaryTreeEdge> getDictionaryTreeEdges() {
        return service.getDictionaryTreeEdges();
    }
}
