package com.coach.board_backend;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TacticRepository extends JpaRepository<Tactic, Long> {
} 
//数据库操作接口