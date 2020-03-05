package at.graz.mug.saat.controller.dictionary;

import at.graz.mug.saat.model.dictionary.DictionaryTreeNode;
import at.graz.mug.saat.service.dictionary.DictionaryTreeNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DictionaryTreeNodeController {

    @Autowired
    private DictionaryTreeNodeService service;

    @GetMapping("dictionarytreenodes")
    public List<DictionaryTreeNode> getDictionaryTreeNode() {
        return service.getDictionaryTreeNode();
    }
}
