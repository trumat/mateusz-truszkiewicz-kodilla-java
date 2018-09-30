package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "jsmith", 'M', LocalDate.of(1980, 6, 6), 4));
        userList.add(new ForumUser(2, "ajones", 'F', LocalDate.of(1999, 5, 6), 1));
        userList.add(new ForumUser(3, "seba", 'M', LocalDate.of(1998, 12, 20), 4));
        userList.add(new ForumUser(4, "xxx", 'M', LocalDate.of(1970, 6, 6), 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(this.userList);
    }
}
