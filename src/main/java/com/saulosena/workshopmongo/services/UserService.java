package com.saulosena.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saulosena.workshopmongo.domain.User;
import com.saulosena.workshopmongo.repository.UserRepository;
import com.saulosena.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
		
	}
	
	/*	public User findById(String id) {
		User user = repo.findOne(id);
		if(user == null) {
			throw new ObjenesisException("objeto não encontrado");
		}
		return user;
	}
}*/

	public User findById(String id) {
		Optional<User> user = repo.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
