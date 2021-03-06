package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SaleRequest {

    private User user;
    private LocalDateTime date;

    public SaleRequest(User user, LocalDateTime date) {
        this.user = user;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
