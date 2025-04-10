package com.pikecape.springboot.data.repository;

import com.pikecape.springboot.data.model.Duck;
import org.springframework.data.repository.CrudRepository;

public interface DuckRepository extends CrudRepository<Duck, Integer> {
  Duck findByUid(String uid);
}
