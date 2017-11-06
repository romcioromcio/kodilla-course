package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.lambda.*;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUser = forum.getUserList().stream()
                .filter(ForumUser -> ForumUser.getSex()=='M')
                .filter(ForumUser -> ForumUser.getDateOfBirth().getYear() <= 1997)
                .filter(ForumUser -> ForumUser.getNumberOfPublishedPosts() >=1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));
        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
