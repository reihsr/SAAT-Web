package at.graz.mug.saat.model.tokenizer;

import at.graz.mug.saat.model.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "word", schema = "saat")
public class Word extends BaseEntity {

    private String token;
    private String category;
    private String lemma;
    private String tag;
    private Integer sentence_count;
    private Integer index_start;
    private Integer index_stop;
    private String field;

    @ManyToOne
    @JoinColumn(name = "sentence_id")
    private Sentence sentence;
}
