package com.michalszalkowski.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MessageController {
  @GetMapping("/test")
  public Message all() {
    return new Message("lorem ipsum");
  }

}