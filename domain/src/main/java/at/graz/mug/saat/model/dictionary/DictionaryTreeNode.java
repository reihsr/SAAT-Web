package at.graz.mug.saat.model.dictionary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//TODO: https://www.baeldung.com/spring-data-rest-relationships#1-the-data-model-1

@Data
@ToString
@Table(name = "dictionary", schema = "saat")
@Entity
public class DictionaryTreeNode {

    @Id()
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer dictionary_id;
    @Column(nullable = true)
    private String synonym;
    @Column(nullable = true)
    private Integer before_synonym;
    @Column(nullable = true)
    private Integer after_synonym;
    @Column(nullable = true)
    private Boolean foreword;
    @Column(nullable = true)
    private Boolean ending;
    @Column(nullable = true)
    private Boolean sentence;
    @Column(nullable = true)
    private Boolean occur;
    @Column(nullable = true)
    private Boolean root;
    @Column(nullable = true)
    private Boolean iscode;
    @Column(nullable = true)
    private Boolean negation;
    @Column(nullable = true)
    private String pattern;
    @Column(nullable = true)
    private String code_typ;
    @Column(nullable = true)
    private String code_value;
    @Column(nullable = true)
    private Boolean priority_node;
    @Column(nullable = true)
    private Integer priority;

    @Transient
    private List<Integer> childes = new ArrayList<Integer>();

    public DictionaryTreeNode() {}

    public DictionaryTreeNode(Integer dictionary_id, String synonym, Integer before_synonym, Integer after_synonym, Boolean foreword,
                              Boolean ending, Boolean sentence, Boolean occur, Boolean root, Boolean iscode, Boolean negation, String pattern,
                              String code_typ, String code_value, Boolean priority_node, Integer priority) {
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

    public String getSynonym() {
        return synonym;
    }

    public Integer getDictionaryId() {
        return dictionary_id;
    }

    public List<Integer> getChildes() {
        return childes;
    }

    public void addChild(Integer dictionaryTreeNodeId) {
        childes.add(dictionaryTreeNodeId);
    }

    public void addChild(List<Integer> dictionaryTreeNodeIds) {
        childes.addAll(dictionaryTreeNodeIds);
    }
}
