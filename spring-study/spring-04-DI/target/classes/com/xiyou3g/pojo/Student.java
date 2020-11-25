package com.xiyou3g.pojo;

import java.sql.PreparedStatement;
import java.util.*;

public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbies;
    private Map<String,String> grade;
    private Set<String> friends;
    private Properties info;
    private String girlfriend;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getGrade() {
        return grade;
    }

    public void setGrade(Map<String, String> grade) {
        this.grade = grade;
    }

    public Set<String> getFriends() {
        return friends;
    }

    public void setFriends(Set<String> friends) {
        this.friends = friends;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public String getGirlfriend() {
        return girlfriend;
    }

    public void setGirlfriend(String girlfriend) {
        this.girlfriend = girlfriend;
    }

    @Override
    public String toString() {
        return "Student\n{" +
                "name='" + name + '\'' +
                "\naddress=" + address +
                "\nbooks=" + Arrays.toString(books) +
                "\nhobbies=" + hobbies +
                "\ngrade=" + grade +
                "\nfriends=" + friends +
                "\ninfo=" + info +
                "\ngirlfriend='" + girlfriend + '\'' +
                '}';
    }
}
