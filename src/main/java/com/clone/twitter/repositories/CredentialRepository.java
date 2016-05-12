package com.clone.twitter.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clone.twitter.entities.Credential;

@Repository
public interface CredentialRepository extends CrudRepository<Credential, Integer>{

}
