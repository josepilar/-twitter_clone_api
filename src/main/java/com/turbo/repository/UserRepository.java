package com.turbo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.turbo.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
