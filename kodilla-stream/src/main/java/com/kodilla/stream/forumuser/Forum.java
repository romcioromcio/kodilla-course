package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Forum {
    private List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add( new ForumUser(1, "Janko", 'M',1990,10,5, 5 ));
        userList.add( new ForumUser(2, "Marko", 'M',1980,5, 2, 50 ));
        userList.add( new ForumUser(3, "Anna", 'K',1970,5, 11, 150 ));
        userList.add( new ForumUser(3, "Anita", 'K',1960,4, 15, 10 ));
        userList.add( new ForumUser(3, "Marta", 'K',1980,3, 22, 15 ));
        userList.add( new ForumUser(3, "Maniek", 'M',1997,2, 10, 11 ));
        userList.add( new ForumUser(3, "Waldek", 'M',2000,1, 9, 2 ));
        userList.add( new ForumUser(3, "Zemek", 'M',2002,2, 8, 1 ));
        userList.add( new ForumUser(3, "Tola", 'K',2003,11, 7, 0 ));
        userList.add( new ForumUser(3, "Beata", 'K',2004,12, 5, 0 ));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
