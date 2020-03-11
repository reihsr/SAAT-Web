package at.graz.mug.saat.model.dictionary;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//TODO: https://www.baeldung.com/spring-data-rest-relationships#1-the-data-model-1

@Data
@ToString
@Table(name = "dictionary", schema = "saat")
@Entity
public class DictionaryTreeNode {
    @Id
    @GeneratedValue
    private int dictionary_id;
    private String synonym;
    private int before_synonym;
    private int after_synonym;
    private boolean foreword;
    private boolean ending;
    private boolean sentence;
    private boolean occur;
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

    public DictionaryTreeNode(int dictionary_id, String synonym, int before_synonym, int after_synonym, boolean foreword,
                              boolean ending, boolean sentence, boolean occur, boolean root, boolean iscode, boolean negation, String pattern,
                              String code_typ, String code_value, boolean priority_node, int priority) {
        this.dictionary_id = dictionary_id;
        this.synonym = synonym;
        this.before_synonym = before_synonym;
        this.after_synonym = after_synonym;
        this.foreword = foreword;
        this.ending = ending;
        this.sentence = sentence;
        this.occur = occur;
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
