package com.sajor.study.c06.model;

import java.util.List;

public class User {
    private int id = 20190801;
    private String name = "";
    private String sex;
    private String email;

    private Card card; //个人关联的证件

    private List<Resume> resumeList;//个人关联的简历

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("id=");
        stringBuffer.append(id);
        stringBuffer.append("\n");
        stringBuffer.append("name=");
        stringBuffer.append(name);
        if (card != null) {
            stringBuffer.append("\n");
            stringBuffer.append("CardID=");
            stringBuffer.append(card.getId());
            stringBuffer.append("\n");
            stringBuffer.append("CardCode=");
            stringBuffer.append(card.getCode());
        }
        if (resumeList != null) {
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
        }
        return stringBuffer.toString();
    }

    public List<Resume> getResumeList() {
        return resumeList;
    }

    public void setResumeList(List<Resume> resumeList) {
        this.resumeList = resumeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
