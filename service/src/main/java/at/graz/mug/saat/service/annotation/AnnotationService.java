package at.graz.mug.saat.service.annotation;

import at.graz.mug.saat.dao.annotationRepository.AnnotationRepository;
import org.springframework.stereotype.Service;

@Service
public class AnnotationService {
    private final AnnotationRepository annotationRepository;

    public AnnotationService(AnnotationRepository annotationRepository) {
        this.annotationRepository = annotationRepository;
    }
}
