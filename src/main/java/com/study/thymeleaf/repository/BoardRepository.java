package com.study.thymeleaf.repository;

import com.study.thymeleaf.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
