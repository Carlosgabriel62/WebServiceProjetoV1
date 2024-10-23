package conn.WebServiceProjetoV1.WebServiceProjetoV1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    List<Usuario> findByNome(String email, String senha);
}
