package com.koseksi.chats.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koseksi.chats.application.Dto.MessagesDto;

public interface ChatsRepository extends JpaRepository<MessagesDto, Integer> {

	public List<MessagesDto> findByFromUserIdOrToUserId(int fromUserId,int toUserId);
}
