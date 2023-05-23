package com.supportportal.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MedExam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MedExam_ky", unique = true)
    private long MedExam_Ky;
    private String MedExam_Name;
    private String MedExam_Note;
    @CreationTimestamp
    private Timestamp MedExam_TimeStampBegin;
    @CreationTimestamp
    private Timestamp MedExam_TimeStampEnd;
    @OneToOne( targetEntity = Service_Hop.class ,cascade = CascadeType.ALL)
    @JoinColumn (name="MedExam_Srvc",referencedColumnName = "Service_Ky")
    private Service_Hop MedExam_Srvc;
    @OneToOne( targetEntity = Patient.class ,cascade = CascadeType.ALL)
    @JoinColumn (name="MedExam_Pk",referencedColumnName = "id")
    private Patient MedExam_Pk ;
}
