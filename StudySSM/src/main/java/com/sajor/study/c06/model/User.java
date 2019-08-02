package com.sajor.study.c06.model;

public class User {
    private int id = 20190801;
    private String name = "";
    private String sex;
    private String email;

    private Card card; //个人关联的证件

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("id=");
        stringBuffer.append(id);
        stringBuffer.append("\n");
        stringBuffer.append("name=");
        stringBuffer.append(name);
        stringBuffer.append("\n");
        stringBuffer.append("CardID=");
        stringBuffer.append(card.getId());
        stringBuffer.append("\n");
        stringBuffer.append("CardCode=");
        stringBuffer.append(card.getCode());
        return stringBuffer.toString();
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
