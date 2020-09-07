package at.graz.mug.saat.dao.annotationRepository;

import at.graz.mug.saat.model.annotation.AnnotationTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnotationTagRepository extends JpaRepository<AnnotationTag, Integer> {
}
