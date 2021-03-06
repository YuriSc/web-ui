package com.parser.server.model.dao;

import com.parser.server.model.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User, Long> {

    User findByLogin(String login);

}
