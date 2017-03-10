package com.xywei.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xywei.config.ConfigBean;
import com.xywei.service.TaskService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigBean.class)
public class TestService {
	@Autowired
	private TaskService test1;

	@Test
	public void test() {
		for (int i = 1; i <= 10; i++) {
			test1.executeTask(i);
			test1.executeTask2(i);

		}

	}

}
