package com.sajor.study.c06.model;

public class Card {
    private Integer id;
    private String code;

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Card [CardId=");
        stringBuffer.append(id);
        stringBuffer.append(", CardCode=");
        stringBuffer.append(code);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
