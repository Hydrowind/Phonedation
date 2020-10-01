package com.hydrowind.phonedation.repositories;

import com.hydrowind.phonedation.entities.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {

}
