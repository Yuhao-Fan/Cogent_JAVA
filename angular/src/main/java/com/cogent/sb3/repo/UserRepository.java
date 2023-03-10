package com.cogent.sb3.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.sb3.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}
