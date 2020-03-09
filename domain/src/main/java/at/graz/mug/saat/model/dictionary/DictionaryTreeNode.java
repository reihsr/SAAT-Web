package at.graz.mug.saat.model.dictionary;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class DictionaryTreeNode {
    @Id
    private int dictionary_id;
    private String synonym;
    private int before_synonym;
    private int after_synonmy;
    private boolean foreword;
    private boolean ending;
    private boolean sentence;
    private boolean occure;
    private boolean root;
    private boolean iscode;
    private boolean negation;
    private String pattern;
    private String code_typ;
    private String code_value;
    private boolean priority_node;
    private int priority;

    public DictionaryTreeNode() {
    }

    public DictionaryTreeNode(int dictionary_id, String synonym, int before_synonym, int after_synonmy, boolean foreword,
            boolean ending, boolean sentence, boolean occure, boolean root, boolean iscode, boolean negation, String pattern,
            String code_typ, String code_value, boolean priority_node, int priority) {
        this.dictionary_id = dictionary_id;
        this.synonym = synonym;
        this.before_synonym = before_synonym;
        this.after_synonmy = after_synonmy;
        this.foreword = foreword;
        this.ending = ending;
        this.sentence = sentence;
        this.occure = occure;
        this.root = root;
        this.iscode = iscode;
        this.negation = negation;
        this.pattern = pattern;
        this.code_typ = code_typ;
        this.code_value = code_value;
        this.priority_node = priority_node;
        this.priority = priority;
    }
}
