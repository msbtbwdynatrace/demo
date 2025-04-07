package com.michalszalkowski.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.ui.Model;

@RestController
class MessageController {

  private String user = "admin";
  private String pass = "admin123456";
  private String password = "admin123456";

  @GetMapping("/test-0/")
  public Message test0() {
    return new Message("test case 0");
  }

  @GetMapping("/test-1/")
  public Message test1() {
    String _user = "admin";
    String _pass = "123456";
    return new Message("test case 1");
  }

  @GetMapping("/test-2/")
  public Message test2(@RequestParam String passkey) {
    return new Message("test case 2 : " + passkey);
  }

  @GetMapping("/test-3/{superpass}")
  public Message test3(@PathVariable String superpass) {
    return new Message("test case 3 : " + superpass);
  }

  @GetMapping("/test-4/")
  public Message test4(@RequestHeader(value = "User-Token") String userToken) {
    return new Message("test case 4 : " + userToken);
  }

  @GetMapping("/test-5/")
  public Message test5() {

    String _user = "admin";
    String _pass = "123456";

    TextDto dto = new TextDto(_user + ":" + _pass);

    return new Message("test case 5: " + dto.toString());
  }

  @GetMapping("/test-6/")
  public Message test6() {

    String _user = "admin";
    String _pass = "123456";

    UserDto userDto = new UserDto(_user, _pass);

    return new Message("test case 6: " + userDto.getPass());
  }

  @GetMapping("/test-7/")
  public Message test7(@RequestHeader Map<String, String> headers) {
    if (headers.containsKey("pass")) {
      return new Message("test case 7 : " + headers.get("pass"));
    } else {
      return new Message("test case 7 : " + headers);
    }
  }

  @GetMapping("/test-8/")
  public Message test8(@ModelAttribute UserForm form, Model model) {
    return new Message("test case 8" + form.getUserText() + form.getPassText());
  }

}