package conn.WebServiceProjetoV1.WebServiceProjetoV1;

import java.util.*;

public class UsuarioManager {
    private List<Usuario> usuarios;

    public UsuarioManager() {
        this.usuarios = new ArrayList<>();
        this.usuarios.add(new Usuario("Carlos", 1,"bertunes"));
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
