package com.example.datatofirebase;

public class Users {


    String firstName,Email,Age,PhoneNumber,userName;

    public Users() {
    }

    public Users(String firstName, String email, String age, String phoneNumber,String userName) {
        this.firstName = firstName;
        Email = email;
        Age = age;
        PhoneNumber = phoneNumber;
        userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

}
