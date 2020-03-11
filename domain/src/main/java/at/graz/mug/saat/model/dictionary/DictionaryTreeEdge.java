package at.graz.mug.saat.model.dictionary;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@ToString
@Entity
@Table(name = "dictionary_link_dictionary", schema = "saat")
public class DictionaryTreeEdge {

    @Id
    @GeneratedValue
    private int edge_id;
    private int dictionary_id;
    private int child_dictionary_id;

    public DictionaryTreeEdge() {}

    public DictionaryTreeEdge(int edge_id, int dictionary_id, int child_dictionary_id) {
        this.edge_id = edge_id;
        this.dictionary_id = dictionary_id;
        this.child_dictionary_id = child_dictionary_id;
    }
}
