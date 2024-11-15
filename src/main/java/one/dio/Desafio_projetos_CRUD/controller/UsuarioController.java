package one.dio.Desafio_projetos_CRUD.controller;

import one.dio.Desafio_projetos_CRUD.model.Usuario;
import one.dio.Desafio_projetos_CRUD.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuar" +
        "ios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<Iterable<Usuario>> buscarTodosUsuario(){
        return ResponseEntity.ok(usuarioService.buscarTodosUsuario());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable int id){
        return ResponseEntity.ok(usuarioService.buscarId(id));
    }

    @PostMapping
    public ResponseEntity<Usuario> inserirUsuario(@RequestBody Usuario usuario){
        usuarioService.inserirUsuario(usuario);
            return ResponseEntity.ok(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizarUsuario(@PathVariable int id,@RequestBody Usuario usuario){
        usuarioService.atualizarUsuario(id,usuario);
            return ResponseEntity.ok(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> deleteUsuario(@PathVariable int id){
        usuarioService.deletarUsuario(id);
        return ResponseEntity.ok().build();
    }

}
