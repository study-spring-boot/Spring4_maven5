package com.xywei.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
	@Async
	public void executeTask(Integer i) {
		System.out.println("---执行异步任务---" + i);
	}

	@Async
	public void executeTask2(Integer i) {
		System.out.println("---执行异步任务第二个---" + i);
	}

}
