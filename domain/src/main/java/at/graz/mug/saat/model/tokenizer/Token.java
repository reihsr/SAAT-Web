package at.graz.mug.saat.model.tokenizer;

import at.graz.mug.saat.model.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "token", schema = "saat")
public class Token extends BaseEntity {

    private String category;
    private String lemma;
    private String tag;

}
