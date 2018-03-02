package com.connectionleak.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DerpRepository extends CrudRepository<DerpEntity, Long> {

  @Query(value = "SELECT 'derp'", nativeQuery = true)
  void derp();
}
