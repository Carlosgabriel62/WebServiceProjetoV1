package conn.WebServiceProjetoV1.WebServiceProjetoV1;

import java.util.*;

public class UsuarioManager {
    private List<Usuario> usuarios;
    private final UsuarioRepository usuarioRepository;

    public UsuarioManager() {
        this.usuarios = new ArrayList<>();
        this.usuarios.add(new Usuario("Carlos", 1,"bertunes"));
    }

    public void adicionarUsuario(Usuario usuario){
        usuarioRepository.save(usuario)
    }
}
