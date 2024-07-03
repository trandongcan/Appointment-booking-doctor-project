package com.asm03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm03.entity.Message;

public interface MessageDao extends JpaRepository<Message, Integer> {

}
