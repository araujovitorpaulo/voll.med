package med.voll.api.consulta;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "consultas")
@Entity(name = "consultas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Consulta {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomepaciente;
    private String nomemedico;
    private String data;
    private String hora;
    private Boolean ativo;

    public Consulta(DadosCadastroConsulta dados) {
        this.nomepaciente = dados.nomepaciente();
        this.nomemedico = dados.nomemedico();
        this.data = dados.data();
        this.hora = dados.hora();
    }

    public void excluir() {
        this.ativo = false;
    }
}
