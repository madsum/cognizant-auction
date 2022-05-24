package com.cognizant.auctioncore.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Credential {
    private String username;
    private String password;
    private List<Role> roles;
}
