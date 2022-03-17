package org.springboot.api.example.application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootRestApiApplication.class)
@WebAppConfiguration

public class SpringBootRestApiApplicationTest {

	@Test
	public void contextLoads() {
		assertTrue(true);
		// do nothing, just to test that the application context loads
	}

}

