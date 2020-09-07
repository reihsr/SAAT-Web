package at.graz.mug.saat.model.annotation;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@ToString
@Entity
@Setter
@Getter
@RequiredArgsConstructor
@Table(name = "annotation_project", schema = "saat")
public class AnnotationProject {

    @Id
    @GeneratedValue
    private Integer annotation_project_id;
    private String annotation_project_uuid;
    private String name;
    private String description;

}
