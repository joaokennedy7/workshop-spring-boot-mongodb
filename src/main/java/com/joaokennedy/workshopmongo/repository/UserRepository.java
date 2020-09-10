package com.joaokennedy.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.joaokennedy.workshopmongo.resource.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
