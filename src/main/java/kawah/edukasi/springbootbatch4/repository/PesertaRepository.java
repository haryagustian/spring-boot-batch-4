package kawah.edukasi.springbootbatch4.repository;

import kawah.edukasi.springbootbatch4.model.PesertaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PesertaRepository extends JpaRepository<PesertaModel, Long> {
}
