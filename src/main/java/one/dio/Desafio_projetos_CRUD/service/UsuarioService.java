package one.dio.Desafio_projetos_CRUD.service;

import one.dio.Desafio_projetos_CRUD.model.Usuario;
import one.dio.Desafio_projetos_CRUD.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Iterable<Usuario> buscarTodosUsuario(){
        return usuarioRepository.findAll();
    }

    public Usuario buscarId(int id){
        Optional<Usuario> usuarioEncontrado = usuarioRepository.findById(id);
        return usuarioEncontrado.get();
    }

    public void inserirUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public void atualizarUsuario(Integer id,Usuario usuario){
        Optional<Usuario> usuario1 = usuarioRepository.findById(id);
        if(usuario1.isPresent()) {
            usuarioRepository.save(usuario);
        }else{
            System.err.println("O usuario não foi encontrado!!!");
        }
    }

    public void deletarUsuario(Integer id){
        usuarioRepository.deleteById(id);
    }
}
