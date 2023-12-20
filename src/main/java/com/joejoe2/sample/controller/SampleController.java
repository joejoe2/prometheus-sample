package com.joejoe2.sample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
  @RequestMapping(path = "/sample", method = RequestMethod.GET)
  public ResponseEntity<Object> sample() {
    return ResponseEntity.ok("sample");
  }
}
