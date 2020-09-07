package at.graz.mug.saat.model.annotation;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.RequiredArgsConstructor;

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
@Table(name = "annotation", schema = "saat")
public class Annotation {
    @Id
    @GeneratedValue
    private Integer annotation_id;
    private Integer annotation_tag_id;
    private Integer annotation_project_id;
    private Integer finding_id;
    private Integer start_position;
    private Integer end_position;
    private String tagged_text;
}
