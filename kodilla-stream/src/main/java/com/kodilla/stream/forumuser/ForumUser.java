package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int userId;
    private String nameUser;
    private char sex;
    private LocalDate dateOfBirth;
    private int numberOfPublishedPosts;

    public ForumUser(int userId, String nameUser, char sex, int year, int month, int day, int numberOfPublishedPosts) {
        this.userId = userId;
        this.nameUser = nameUser;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.numberOfPublishedPosts = numberOfPublishedPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPublishedPosts() {
        return numberOfPublishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", nameUser='" + nameUser + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPublishedPosts=" + numberOfPublishedPosts +
                '}';
    }
    public int hashCode(){
        return dateOfBirth.getYear();
    }
}
