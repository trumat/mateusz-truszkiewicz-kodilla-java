package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMapOfUsers = forum.getUserList().stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> Period.between(user.getDateOfBirth(), LocalDate.now()).getYears() > 20)
                .filter(user -> user.getPostCount() > 0)
                .collect(Collectors.toMap(user -> user.getID(), user -> user));

        resultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}