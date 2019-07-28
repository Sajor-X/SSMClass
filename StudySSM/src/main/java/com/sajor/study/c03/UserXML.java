package com.sajor.study.c03;

public class UserXML {
    private int id = 20180101;
    private String name = "AspectJXML 测试用户";
    private String sex;
    private String email;

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

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("id=");
        stringBuffer.append(id);
        stringBuffer.append("\n");
        stringBuffer.append("name=");
        stringBuffer.append(name);
        return stringBuffer.toString();
    }

    public void saveUser() {
        System.out.println("保存用户信息...");
    }

    public void queryUser() {
        System.out.println("查看用户信息...");
        //email.length();
        System.out.println(this.toString());
    }

}
