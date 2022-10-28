package kawah.edukasi.springbootbatch4.controller;
import kawah.edukasi.springbootbatch4.service.PesertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/peserta")
public class PesertaController {
  @Autowired
  PesertaService pesertaService;
  @PostMapping
  public ResponseEntity<String> post(
      @RequestParam("name") String name,
      @RequestParam("address") String address,
      @RequestParam("email") String email,
      @RequestParam("phone") String phoneNumber,
      @RequestParam("role") String role,
      @RequestParam("class") Character className,
      @RequestParam("batch") Integer batch){
    return pesertaService.post(name,address,email,phoneNumber,role,className,batch);
  }

  @GetMapping("/{id}")
  public ResponseEntity<String> letGetById(@PathVariable("id") Long id){
    return pesertaService.letGetById(id);
  }
}
