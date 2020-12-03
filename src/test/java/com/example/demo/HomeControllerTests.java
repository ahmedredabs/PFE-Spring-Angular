package com.example.demo;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pfe.MainApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainApplication.class)
class HomeControllerTests {
	@Test
	void testTest() {
		// This is a dummy test, we will have to write actual tests later.
		// -- Alfa
		assertTrue(true);
	}
}
