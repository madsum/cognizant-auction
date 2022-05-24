package com.cognizant.auctioncore.events;

import com.cognizant.auctioncore.model.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserUpdatedEvent {
    private String id;
    private User user;
}
