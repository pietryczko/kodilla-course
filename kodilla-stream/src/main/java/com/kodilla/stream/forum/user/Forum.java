package com.kodilla.stream.forum.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(0001, "Jan", 'm', LocalDate.of(2000,10,15), 5));
        forumUserList.add(new ForumUser(0002, "Katarzyna", 'k', LocalDate.of(2000,10,15), 5));
        forumUserList.add(new ForumUser(0003, "Marek", 'm', LocalDate.of(2010,10,15), 5));
        forumUserList.add(new ForumUser(0004, "Damian", 'm', LocalDate.of(2000,10,15), 0));
        forumUserList.add(new ForumUser(0005, "Dawid", 'm', LocalDate.of(1985,10,15), 10));
        forumUserList.add(new ForumUser(0006, "Andrzej", 'm', LocalDate.of(2001,10,15), 15));
        forumUserList.add(new ForumUser(0007, "Cezary", 'm', LocalDate.of(1998,10,15), 7));
        forumUserList.add(new ForumUser(0007, "Aleksandra", 'k', LocalDate.of(1998,10,15), 7));
    }

    public List <ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
