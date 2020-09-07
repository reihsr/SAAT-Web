package at.graz.mug.saat.service.annotation;

import at.graz.mug.saat.dao.annotationRepository.AnnotationTagRepository;
import org.springframework.stereotype.Service;

@Service
public class AnnotationTagService {
    private final AnnotationTagRepository annotationTagRepository;

    public AnnotationTagService(AnnotationTagRepository annotationTagRepository) {
        this.annotationTagRepository = annotationTagRepository;
    }
}
