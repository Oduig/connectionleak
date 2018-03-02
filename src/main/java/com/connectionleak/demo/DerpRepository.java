package com.connectionleak.demo;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DerpRepository extends CrudRepository<DerpEntity, Long> {

  @Transactional
  @Query(value = "SELECT 'derp'", nativeQuery = true)
  void derp();
}
