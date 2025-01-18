package com.osticket.ostickets.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.osticket.ostickets.model.User;

@Repository
public interface UserRepository extends MongoRepository<User,String>{

    
}
