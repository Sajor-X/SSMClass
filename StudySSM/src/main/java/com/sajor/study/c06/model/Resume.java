package com.sajor.study.c06.model;

public class Resume {
    private Integer resumeId;
    private Integer userId;
    private String resumeName;
    private String resumeDesc;

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }

    public String getResumeDesc() {
        return resumeDesc;
    }

    public void setResumeDesc(String resumeDesc) {
        this.resumeDesc = resumeDesc;
    }
}
