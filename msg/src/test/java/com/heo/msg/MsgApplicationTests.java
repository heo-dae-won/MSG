package com.heo.msg;

import com.heo.msg.messenger.Slack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MsgApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void messengerTest(){
		Slack slack = new Slack();
		String result = slack.defaultMethod("string");

		assertEquals("default Methodstring", result);
	}

}
