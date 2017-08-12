package com.parser.server.model.service;

import com.parser.server.model.dao.UserDAO;
import com.parser.server.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    private UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User findByLogin(String login) {
        return userDAO.findByLogin(login);
    }

    @Transactional
    public User createUserIfNotExists(String login, String password) {
        User user = userDAO.findByLogin(login);
        if (user == null) {
            user = new User();
            user.setLogin(login);
            user.setPassword(password);

            userDAO.save(user);
        }

        return user;
    }
}
