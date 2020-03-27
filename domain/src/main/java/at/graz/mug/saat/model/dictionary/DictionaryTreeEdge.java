package at.graz.mug.saat.model.dictionary;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
@Table(name = "dictionary_link_dictionary", schema = "saat")
public class DictionaryTreeEdge {

    @Id
    @GeneratedValue
    private Integer edge_id;
    @Column(name="dictionary_id")
    private Integer dictionaryid;
    private Integer child_dictionary_id;

    public DictionaryTreeEdge() {}

    public DictionaryTreeEdge(int edge_id, int dictionaryid, int child_dictionary_id) {
        this.edge_id = edge_id;
        this.dictionaryid = dictionaryid;
        this.child_dictionary_id = child_dictionary_id;
    }

    public Integer getChildDictionaryId() {
        return child_dictionary_id;
    }
}
