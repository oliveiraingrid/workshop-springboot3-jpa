package com.coursespringboot.demo.repositories;

import com.coursespringboot.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {


}
