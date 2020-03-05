package at.graz.mug.saat.model.dictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@ToString
@Entity
public class DictionaryTreeNode {
    @Id
    private int dictionary_id;
    private String synonym;
    private int before_synonym;
    private int after_synonmy;
    private boolean root;
    private boolean code;
    private String code_typ;
    private String code_value;

    public DictionaryTreeNode() {
    }

    public DictionaryTreeNode(int i, String root, int i1, int i2, boolean b, boolean b1, String s, String s1) {
        dictionary_id = i;
        synonym = root;
        before_synonym = i1;
        after_synonmy = i2;
        this.root = b;
        code = b1;
        code_typ = s;
        code_value = s1;
    }
}
