package com.clone.twitter.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clone.twitter.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
