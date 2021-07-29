package com.practice.chapter2.checkpoint3;

public class Person {
    private Role role;
    private String location;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setRole(new Driver());

        p.setLocation("회사");
        p.setRole(new Worker());
    }
}
