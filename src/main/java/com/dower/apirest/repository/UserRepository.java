package com.dower.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dower.apirest.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
