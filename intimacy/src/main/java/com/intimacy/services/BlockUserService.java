package com.intimacy.services;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.intimacy.request.BlockUserRequestEntity;

public interface BlockUserService {

	ResponseEntity<Map<String, Object>> addBlockUser(BlockUserRequestEntity BlockUserRequestEntity);
}
