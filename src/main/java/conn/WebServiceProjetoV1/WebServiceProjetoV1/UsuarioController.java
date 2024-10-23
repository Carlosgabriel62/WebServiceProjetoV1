package conn.WebServiceProjetoV1.WebServiceProjetoV1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RequestMapping("/api")
public class UsuarioController{
    private UsuarioManager manager = new UsuarioManager();

    @Postmapping("/usuarios")
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        manager.adicionarUsuario(usuario);
        return usuario;
    }

    @PostMapping("/usuarios/procurar")
    public Usuario armazenarUsuarioLogin(@RequestBody Usuario usuario) {
        return usuario; 
    }


    @Getmapping("/users")
    public Optional<Usuario> autenticarUsuario(Usuario usuario) {
        return List<Usuario> usuarios = usuarioRepository.findAll();}
}