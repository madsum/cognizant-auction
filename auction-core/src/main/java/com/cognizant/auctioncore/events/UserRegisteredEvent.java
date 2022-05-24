package com.cognizant.auctioncore.events;

import com.cognizant.auctioncore.model.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegisteredEvent {
    private String id;
    private User user;
}
