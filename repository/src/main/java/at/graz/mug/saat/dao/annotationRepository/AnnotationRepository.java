package at.graz.mug.saat.dao.annotationRepository;

import at.graz.mug.saat.model.annotation.Annotation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnotationRepository extends JpaRepository<Annotation, Integer> {
}
