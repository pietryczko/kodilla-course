package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forum.user.Forum;
import com.kodilla.stream.forum.user.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));                    // [2]

        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> (LocalDate.now().getYear() - forumUser.getBirthday().getYear()) >= 20)
                .filter(forumUser -> forumUser.getPostedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getID, forumUser -> forumUser));

        System.out.println(theResultMapOfUsers);

    }
}