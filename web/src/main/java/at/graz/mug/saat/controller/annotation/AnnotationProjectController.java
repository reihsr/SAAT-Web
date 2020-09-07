package at.graz.mug.saat.controller.annotation;

import at.graz.mug.saat.model.annotation.AnnotationProject;
import at.graz.mug.saat.service.annotation.AnnotationProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AnnotationProjectController {
    @Autowired
    private AnnotationProjectService service;

    @GetMapping("getAnnotationProjects")
    public List<AnnotationProject> getAnnotationProjects() {
        return service.getAnnotationProjects();
    }
}
