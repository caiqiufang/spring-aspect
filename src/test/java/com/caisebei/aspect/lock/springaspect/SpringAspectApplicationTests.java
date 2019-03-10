package com.caisebei.aspect.lock.springaspect;

import com.caisebei.aspect.lock.springaspect.bean.TestBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAspectApplicationTests {

	@Autowired
	private TestBean test;

	@Test
	public void contextLoads() {

		test.testPrint();
		test.testPrint2();

	}

}
