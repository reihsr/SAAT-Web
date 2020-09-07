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
@Table(name = "annotation_tag", schema = "saat")
public class AnnotationTag {
    @Id
    @GeneratedValue
    private Integer annotation_tag_id;
    private Integer annotation_project_id;
    private String tag_name;
}
