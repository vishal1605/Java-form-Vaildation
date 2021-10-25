package com.serverValidation.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serverValidation.beans.Users;

@Service
public class UsersDao {

	@Autowired
	private UsersRepository repo;

	public Users save(Users users) {
		Users save = repo.save(users);
		return save;
	}

	public List<Users> getAllUsers() {
		List<Users> list = repo.findAll();
		return list;
	}

	public Users getById(int id) {
		Users id2 = repo.getById(id);
		return id2;
	}
	
	public Users update(Users u) {
		Users save = repo.save(u);
		return save;
		
	}

}
