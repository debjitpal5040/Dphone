package com.debjit.pal.Dphone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debjit.pal.Dphone.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
