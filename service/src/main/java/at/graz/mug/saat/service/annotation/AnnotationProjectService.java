package at.graz.mug.saat.service.annotation;

import at.graz.mug.saat.dao.annotationRepository.AnnotationProjectRepository;
import at.graz.mug.saat.model.annotation.AnnotationProject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnotationProjectService {
    private final AnnotationProjectRepository annotationProjectRepository;

    public AnnotationProjectService(AnnotationProjectRepository annotationProjectRepository) {
        this.annotationProjectRepository = annotationProjectRepository;
    }

    public List<AnnotationProject> getAnnotationProjects() {
        return annotationProjectRepository.findAll();
    }
}
