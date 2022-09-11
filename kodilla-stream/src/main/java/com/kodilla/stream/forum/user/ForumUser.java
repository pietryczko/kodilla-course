package com.kodilla.stream.forum.user;

import java.time.LocalDate;

public class ForumUser {
    private final int ID;
    private final String userName;
    private final char sex;
    private final LocalDate birthday;
    private final int postedPosts;

    public ForumUser(int ID, String userName, char sex, LocalDate birthday, int postedPosts) {
        this.ID = ID;
        this.userName = userName;
        this.sex = sex;
        this.birthday = birthday;
        this.postedPosts = postedPosts;
    }

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPostedPosts() {
        return postedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", postedPosts=" + postedPosts +
                '}';
    }
}
