package com.cognizant.seller.cmd.api.command;

import com.cognizant.auctioncore.model.User;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@Builder
public class RegisterUserCommand {
    @TargetAggregateIdentifier
    private String id;
    private User user;
}
