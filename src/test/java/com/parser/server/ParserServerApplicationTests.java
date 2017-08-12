package com.parser.server;

import com.parser.server.model.entity.User;
import com.parser.server.model.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParserServerApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	public void testUserCreation() {
		String login = "test";

		User user = userService.createUserIfNotExists(login, "pass");
		User persistentUser = userService.findByLogin(login);

		Assert.assertEquals(user, persistentUser);
	}

}
