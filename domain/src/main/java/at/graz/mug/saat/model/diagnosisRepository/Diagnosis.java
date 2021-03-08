package at.graz.mug.saat.model.diagnosisRepository;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@ToString
@Entity
@Table(name = "findings_materialized_view", schema = "saat")
public class Diagnosis {

    @Id
    @GeneratedValue
    private Integer finding_id;
    private Long befund_id;
    private String aura_index;
    private Long patient_id;
    private Integer age;
    private String examination_type;
    private Date examination_date;
    private Long examination_number;
    private String diagnosis;
    private String diagnosis_clean;
    private String organ;
    private String organ_zuordnung;
    private String source;
    private String t;
    private String n;
    private String m;
    private String g;
    private String r;
    private String l;
    private String v;

    public Diagnosis() {}

    public Diagnosis(Integer finding_id, Long befund_id, String aura_index, Long patient_id, Integer age, String examination_type,
                     Date examination_date, Long examination_number, String diagnosis, String diagnosis_clean, String organ,
                     String organ_zuordnung, String source, String t, String n, String m, String g, String r, String l, String v) {
        this.finding_id = finding_id;
        this.befund_id = befund_id;
        this.aura_index = aura_index;
        this.patient_id = patient_id;
        this.age = age;
        this.examination_type = examination_type;
        this.examination_date = examination_date;
        this.examination_number = examination_number;
        this.diagnosis = diagnosis;
        this.diagnosis_clean = diagnosis_clean;
        this.organ = organ;
        this.organ_zuordnung = organ_zuordnung;
        this.source = source;
        this.t = t;
        this.n = n;
        this.m = m;
        this.g = g;
        this.r = r;
        this.l = l;
        this.v = v;
    }
}
