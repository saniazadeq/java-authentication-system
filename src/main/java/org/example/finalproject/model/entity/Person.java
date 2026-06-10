package org.example.finalproject.model.entity;

public class Person {
    String username;
    String passowrd;
    String repassword;
    Long id;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public Person() {
    }


    public Person(String username, String passowrd, String repassword) {
        this.username = username;
        this.passowrd = passowrd;
        this.repassword = repassword;
    }
}
