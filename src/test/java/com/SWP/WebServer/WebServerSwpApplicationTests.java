package com.SWP.WebServer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import javax.sql.DataSource;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class WebServerSwpApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Test
	void contextLoads() {
		assertNotNull(dataSource);
	}
}
