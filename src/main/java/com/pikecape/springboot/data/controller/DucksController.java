package com.pikecape.springboot.data.controller;

import com.pikecape.springboot.data.model.Duck;
import com.pikecape.springboot.data.service.DuckService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ducks")
@RequiredArgsConstructor
public class DucksController {
  private final DuckService duckService;

  @GetMapping
  public List<Duck> getDucks() {
    return duckService.getDucks();
  }

  @GetMapping("/{uid}")
  public Duck getDuck(
      @PathVariable String uid
  ) {
    return duckService.getDuck(uid);
  }

  @PostMapping
  public Duck createDuck(
      @RequestBody Duck duck
  ) {
    return duckService.createDuck(duck);
  }

  @PutMapping("/{uid}")
  public Duck updateDuck(
      @PathVariable String uid,
      @RequestBody Duck duck
  ) {
    return duckService.updateDuck(uid, duck);
  }

  @DeleteMapping("/{uid}")
  public void deleteDuck(
      @PathVariable String uid
  ) {
    duckService.deleteDuck(uid);
  }
}
