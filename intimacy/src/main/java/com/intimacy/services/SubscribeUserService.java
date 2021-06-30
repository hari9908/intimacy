package com.intimacy.services;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.intimacy.request.SubscribeUserRequestEntity;

public interface SubscribeUserService {

	ResponseEntity<Map<String, Object>> addSubscribeUser(SubscribeUserRequestEntity subscribeUserRequestEntity);
}
