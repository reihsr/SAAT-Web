package at.graz.mug.saat.model.tokenizer;

import at.graz.mug.saat.model.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "sentence", schema = "saat")
public class Sentence extends BaseEntity {
    private String sentence;
    private String source;
    private Integer source_id;
    private Integer index_start;
    private Integer index_stop;
    private String field;

    @OneToMany(mappedBy = "sentence", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Word> words = new HashSet<>();
}
