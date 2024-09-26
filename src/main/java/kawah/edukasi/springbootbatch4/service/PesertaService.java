package kawah.edukasi.springbootbatch4.service;
import kawah.edukasi.springbootbatch4.model.PesertaModel;
import kawah.edukasi.springbootbatch4.repository.PesertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class PesertaService {
  @Autowired
  PesertaRepository pesertaRepository;

  public ResponseEntity<String> post(
      String nama,
      String alamat,
      String surel,
      String nomor,
      String peran,
      Character kelas,
      Integer kelompok
  ){
    PesertaModel pesertaModel= new PesertaModel();
    pesertaModel.name = nama;
    pesertaModel.address = alamat;
    pesertaModel.email = surel;
    pesertaModel.phoneNumber = nomor;
    pesertaModel.role = peran;
    pesertaModel.className = kelas;
    pesertaModel.batch = kelompok;
    pesertaModel = pesertaRepository.save(pesertaModel);
    return ResponseEntity.ok("id nya adalah : " + pesertaModel.id);
//    return ResponseEntity.ok(pesertaRepository.save(pesertaModel).id);
  }
  public ResponseEntity<String> letGetById(Long id){
    Optional<PesertaModel> optionalPesertaModel = pesertaRepository.findById(id);
    if(optionalPesertaModel.isEmpty()){
      return new ResponseEntity<>("PESERTA NOT FOUND DUDE", HttpStatus.BAD_REQUEST);
    }
    PesertaModel pesertaModel = optionalPesertaModel.get();
    return ResponseEntity.ok(pesertaModel.toString());
  }
}
