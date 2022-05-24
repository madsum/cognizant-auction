package com.cognizant.buyer.query.api.handlers;


import com.cognizant.auctioncore.events.UserRegisteredEvent;
import com.cognizant.auctioncore.events.UserRemovedEvent;
import com.cognizant.auctioncore.events.UserUpdatedEvent;

public interface UserEventHandler {
    void on(UserRegisteredEvent event);
    void on(UserUpdatedEvent event);
    void on(UserRemovedEvent event);
}
