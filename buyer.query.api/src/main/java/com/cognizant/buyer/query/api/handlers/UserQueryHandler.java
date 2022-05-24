package com.cognizant.buyer.query.api.handlers;


import com.cognizant.buyer.query.api.dto.UserLookupResponse;
import com.cognizant.buyer.query.api.query.FindAllUsersQuery;
import com.cognizant.buyer.query.api.query.FindUserByIdQuery;
import com.cognizant.buyer.query.api.query.SearchUsersQuery;

public interface UserQueryHandler {
    UserLookupResponse getUserById(FindUserByIdQuery query);
    UserLookupResponse searchUsers(SearchUsersQuery query);
    UserLookupResponse getAllUsers(FindAllUsersQuery query);
}
