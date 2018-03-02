package com.connectionleak.demo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;

@Configuration
@EnableScheduling
@SuppressWarnings("unused")
public class MasterConfig {

  /**
   * Cleans up the following log message:
   * "No TaskScheduler/ScheduledExecutorService bean found for scheduled processing"
   */
  @Bean
  public ScheduledExecutorService scheduledExecutorService() {
    return Executors.newSingleThreadScheduledExecutor();
  }

  @Bean
  public ConcurrentTaskScheduler scheduler(ScheduledExecutorService scheduledExecutorService) {
    return new ConcurrentTaskScheduler(scheduledExecutorService);
  }
}
