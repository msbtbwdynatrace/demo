package com.michalszalkowski.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
class MessageController {

  private String user = "admin";
  private String pass = "admin123456";
  private String password = "admin123456";

  @GetMapping("/test")
  public Message test1(@RequestParam String passkey) {
    return new Message("lorem ipsum 1: " + passkey);
  }

  @GetMapping("/test2")
  public Message test2() {
    String user2 = "michal";
    return new Message("lorem ipsum 2");
  }

}