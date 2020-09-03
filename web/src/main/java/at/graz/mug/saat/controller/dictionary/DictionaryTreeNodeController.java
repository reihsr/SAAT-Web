package at.graz.mug.saat.controller.dictionary;

import at.graz.mug.saat.model.dictionary.DictionaryTreeNode;
import at.graz.mug.saat.service.dictionary.DictionaryTreeNodeService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DictionaryTreeNodeController {

    @Autowired
    private DictionaryTreeNodeService service;

    @GetMapping("rootnodes")
    public List<DictionaryTreeNode> getDictionaryTreeRootNode() {
        System.out.println("Call to service get root nodes!");
        return service.getDictionaryTreeNodes();
    }

    @GetMapping("rootnodesstartingwith")
    public List<DictionaryTreeNode> getDictionaryTreeRootNode(String startswith) {
        System.out.println("Call to service get root nodes!");
        return service.getDictionaryTreeNodes(startswith);
    }

    @GetMapping("getchildnodes")
    public List<DictionaryTreeNode> getDictionaryTreeChildNode(Integer parentId) {
        System.out.println("Call to service get Child Nodes for " + parentId + "!");
        return service.getDictionaryTreeNodes(parentId);
    }
}
