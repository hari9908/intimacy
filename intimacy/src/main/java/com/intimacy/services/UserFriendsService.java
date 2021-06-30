package com.intimacy.services;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.intimacy.request.UserFriendsListRequestEntity;
import com.intimacy.request.UserFriendsRequestEntity;

public interface UserFriendsService {

	ResponseEntity<Map<String, Object>> addUserFriends(UserFriendsRequestEntity userFriendsRequestEntity);

	ResponseEntity<Map<String, Object>> getUserFriendsList(UserFriendsListRequestEntity userFriendsListRequestEntity);

	ResponseEntity<Map<String, Object>> getCommonUserFriends(UserFriendsRequestEntity userFriendsRequestEntity);
}
