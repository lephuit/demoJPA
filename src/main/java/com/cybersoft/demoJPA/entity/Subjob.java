package com.cybersoft.demoJPA.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "sub_job")
@IdClass(IdJobUsers.class)
public class Subjob {
    @Id
    private int userID;
    @Id
    private  int jobID;
    private String nameSubjob;


}
@Embeddable
class MyKey implements Serializable {

    @Column(name = "user_id", nullable = false)
    private int userID;

    @Column(name = "job_id", nullable = false)
    private int jobID;

    /** getters and setters **/
}
