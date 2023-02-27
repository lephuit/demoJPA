package com.cybersoft.demoJPA.entity;

import javax.persistence.Column;
import java.io.Serializable;



public class IdJobUsers implements Serializable {
    @Column(name = "user_id")
    private int userId;
    @Column(name = "job_id")
    private int jobId;
    public IdJobUsers(int userId,int jobId){
        this.jobId=jobId;
        this.userId=userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }
}
