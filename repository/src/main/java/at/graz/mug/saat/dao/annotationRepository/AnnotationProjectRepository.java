package at.graz.mug.saat.dao.annotationRepository;

import at.graz.mug.saat.model.annotation.AnnotationProject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnotationProjectRepository extends JpaRepository<AnnotationProject, Integer> {
}
