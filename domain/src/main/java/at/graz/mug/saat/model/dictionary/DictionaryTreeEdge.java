package at.graz.mug.saat.model.dictionary;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class DictionaryTreeEdge {

    @Id
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
