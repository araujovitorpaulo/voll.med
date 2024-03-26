package med.voll.api.consulta;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface ConsultaRepository extends JpaRepository <Consulta, Long> {

}
