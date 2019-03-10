package com.caisebei.aspect.lock.springaspect;

import com.caisebei.aspect.lock.springaspect.bean.TestBean;
import com.caisebei.aspect.lock.springaspect.util.RedissLockUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAspectApplicationTests {

	@Autowired
	private TestBean test;

	@Test
	public void contextLoads() {

		RLock sirialKey = RedissLockUtil.lock("sirialKey");
		System.out.println("****************** :"  + sirialKey.isLocked());
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		RedissLockUtil.unlock(sirialKey);
		System.out.println("*******************: " + sirialKey.isLocked());
	}

}
