package kawah.edukasi.springbootbatch4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/root/next")
public class RootEndPointController {

  @GetMapping("/peserta")
  public String peserta(){
    return "Spring Boot : Peserta";
  }

  @GetMapping("/materi")
  public String materi(){
    return "Spring Boot : Materi";
  }

  @GetMapping("/jadwal")
  public String jadwal(){
    return "Spring Boot : Jadwal";
  }
}
