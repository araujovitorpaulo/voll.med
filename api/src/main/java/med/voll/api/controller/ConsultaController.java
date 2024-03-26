package med.voll.api.controller;

import med.voll.api.consulta.Consulta;
import med.voll.api.consulta.ConsultaRepository;
import med.voll.api.consulta.DadosCadastroConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("consultas")
public class ConsultaController {

    @Autowired
    private ConsultaRepository repository;

    @PostMapping @Transactional
    public void cadastrar(@RequestBody DadosCadastroConsulta dados){
        repository.save(new Consulta(dados));
    }

    @DeleteMapping("/{id}") @Transactional
    public void excluir(@PathVariable Long id){
        var consulta = repository.getReferenceById(id);
        consulta.excluir();
    }

}
