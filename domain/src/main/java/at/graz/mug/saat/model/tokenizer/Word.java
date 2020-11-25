package at.graz.mug.saat.model.tokenizer;

import at.graz.mug.saat.model.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
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
}
