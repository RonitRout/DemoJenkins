package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(DemoApplicationTests.class);
	@Test
	public void contextLoads() {

	logger.info("Test case executing:");

	}

}
