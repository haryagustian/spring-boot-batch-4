package kawah.edukasi.springbootbatch4.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/http-verbs")
public class HtppVerbsController {

  @GetMapping()
  public String get(){
    return "Spring Boot Tested GET Request";
  }

  @PostMapping
  public String post(){
    return "Spring Boot Tested POST Request";
  }

  @PutMapping
  public String put(){
    return "Spring Boot Tested PUT Request";
  }

  @DeleteMapping
  public String del(){
    return "Spring Boot Tested DELETE Request";
  }
}
