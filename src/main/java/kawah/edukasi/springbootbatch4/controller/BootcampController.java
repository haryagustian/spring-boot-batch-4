package kawah.edukasi.springbootbatch4.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bootcamp")
public class BootcampController {

  @GetMapping
  public String get(){
    return "Tested GET Request";
  }

  @PostMapping
  public String post(){
    return "Tested POST Request";
  }

  @PutMapping
  public String put(){
    return "Tested PUT Request";
  }

  @DeleteMapping
  public String del(){
    return "Tested DELETE Request";
  }
}
