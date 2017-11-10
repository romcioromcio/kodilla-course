package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    Statistics statistics;
    int quantityUsers;
    int quantityPostCount;
    int quantityCommentsCount;
    double averagePostUsers;
    double averageCommentsUsers;
    double averageCommentsPost;

    public ForumStatistics (Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
        List<String> usersList = statistics.usersNames();
        this.quantityUsers = usersList.size();
        this.quantityPostCount = statistics.postsCount();
        this.quantityCommentsCount = statistics.commentsCount();

        if (quantityPostCount !=0 && quantityUsers !=0){
            this.averagePostUsers = (double) quantityPostCount/quantityUsers;
        }else {
            this.averagePostUsers = 0;
        }
        if (quantityCommentsCount !=0 && quantityUsers !=0){
            this.averageCommentsUsers = (double) quantityCommentsCount/quantityUsers;
        }else {
            this.averageCommentsUsers = 0;
        }
        if (quantityCommentsCount !=0 && quantityPostCount !=0){
            this.averageCommentsPost = (double) quantityCommentsCount/quantityPostCount;
        }else {
            this.averageCommentsPost = 0;
        }
    }
}
