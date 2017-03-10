package com.xywei.config;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@ComponentScan("com.xywei.*")
@EnableAsync
public class ConfigBean implements AsyncConfigurer {
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor threadPoolExecutor = new ThreadPoolTaskExecutor();
		threadPoolExecutor.setCorePoolSize(5);
		threadPoolExecutor.setMaxPoolSize(20);
		threadPoolExecutor.setQueueCapacity(25);
		threadPoolExecutor.setKeepAliveSeconds(300);
		threadPoolExecutor.initialize();
		return threadPoolExecutor;
	}

}
