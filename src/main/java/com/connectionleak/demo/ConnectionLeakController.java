package com.connectionleak.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequestMapping("/")
@SuppressWarnings("unused")
public class ConnectionLeakController {

  private static final long SSE_TIMEOUT_MS = 60_000L;

  private final DerpRepository derpRepository;
  private final SseObservable obs;

  ConnectionLeakController(DerpRepository derpRepository) {
    this.derpRepository = derpRepository;
    obs = new SseObservable(SSE_TIMEOUT_MS);
  }

  @GetMapping("")
  public SseEmitter home() {
    derpRepository.derp();
    return obs.subscribeSse();
  }

  @Scheduled(fixedRate = 3000L)
  public void herpDerp() {
    obs.send("herp-derp-" + System.currentTimeMillis());
  }
}
