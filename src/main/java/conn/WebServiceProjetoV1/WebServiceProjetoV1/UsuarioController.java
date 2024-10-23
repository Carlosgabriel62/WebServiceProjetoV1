package conn.WebServiceProjetoV1.WebServiceProjetoV1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RequestMapping("/api")
public class UsuarioController{
    private UsuarioManager manager = new UsuarioManager();

    @GetMapping("/api/usuarios")
    public List<Usuario> getUsuarios() {
        return manager.getUsuarios();
    }
}