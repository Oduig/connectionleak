package com.connectionleak.demo;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
class DerpService {

  private final DerpRepository derpRepository;

  DerpService(DerpRepository derpRepository) {
    this.derpRepository = derpRepository;
  }

  @Transactional
  void derp() {
    derpRepository.derp();
  }
}
