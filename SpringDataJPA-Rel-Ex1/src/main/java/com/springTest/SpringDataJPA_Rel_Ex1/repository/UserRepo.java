package com.springTest.SpringDataJPA_Rel_Ex1.repository;

import com.springTest.SpringDataJPA_Rel_Ex1.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
