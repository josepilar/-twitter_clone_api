package com.clone.twitter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clone.twitter.entities.Credential;
import com.clone.twitter.repositories.CredentialRepository;

@Service
public class CredentialServiceImpl implements CredentialIService {

	@Autowired
	CredentialRepository credentialRepository;
	
	@Override
	public Credential saveCredential(Credential credential) {
		return credentialRepository.save(credential);
	}
	
}
