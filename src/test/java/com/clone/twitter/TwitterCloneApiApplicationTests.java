package com.clone.twitter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.clone.twitter.TwitterCloneApiApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TwitterCloneApiApplication.class)
@WebAppConfiguration
public class TwitterCloneApiApplicationTests {

	@Test
	public void contextLoads() {
	}

}
