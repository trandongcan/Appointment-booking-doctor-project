package com.asm03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm03.entity.Review;

public interface ReviewDao extends JpaRepository<Review, Integer> {

}
