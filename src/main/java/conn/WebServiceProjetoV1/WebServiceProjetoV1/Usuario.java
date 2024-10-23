package conn.WebServiceProjetoV1.WebServiceProjetoV1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario{

    private String nome;
    private int id;
    private String email;


    
}