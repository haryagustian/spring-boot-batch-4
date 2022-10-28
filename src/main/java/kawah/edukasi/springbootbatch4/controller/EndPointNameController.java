package kawah.edukasi.springbootbatch4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPointNameController {

  @GetMapping("/firstName")
  public String firstName(){
    return "Hary";
  }
  @GetMapping("/lastName")
  public String lastName(){
    return "Hary";
  }
  @GetMapping("/age")
  public Integer age(){
    return 25;
  }
}
