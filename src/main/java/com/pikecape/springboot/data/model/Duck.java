package com.pikecape.springboot.data.model;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Builder(toBuilder = true)
@Table(name = "ducks")
@Value
public class Duck {
  @Id
  Integer id;
  String uid;
  String name;

  LocalDateTime createdAt;
  LocalDateTime updatedAt;
}
