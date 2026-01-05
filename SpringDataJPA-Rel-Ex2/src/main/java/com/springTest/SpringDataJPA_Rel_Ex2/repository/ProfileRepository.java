package com.springTest.SpringDataJPA_Rel_Ex2.repository;

import com.springTest.SpringDataJPA_Rel_Ex2.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {
}
