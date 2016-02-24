package com.turbo.repositories;

import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.turbo.entities.User;

@Repository
public interface UserRepository extends JpaSpecificationExecutor<User>, JpaRepository<User, Integer>{
	

}