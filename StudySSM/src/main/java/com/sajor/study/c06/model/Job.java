package com.sajor.study.c06.model;

import java.util.List;

public class Job {
    private Integer jobId;
    private String jobTitle;
    private List<Resume> resumeList; // 岗位关联的简历

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("jobid=");
        stringBuffer.append(jobId);
        stringBuffer.append("\n");
        stringBuffer.append("jobtitle=");
        stringBuffer.append(jobTitle);
        for (Resume rs : resumeList) {
            stringBuffer.append("\n");
            stringBuffer.append("Resume:[");
            stringBuffer.append(rs.getResumeId());
            stringBuffer.append(",");
            stringBuffer.append(rs.getResumeName());
            stringBuffer.append(",");
            stringBuffer.append(rs.getResumeDesc());
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<Resume> getResumeList() {
        return resumeList;
    }

    public void setResumeList(List<Resume> resumeList) {
        this.resumeList = resumeList;
    }
}
