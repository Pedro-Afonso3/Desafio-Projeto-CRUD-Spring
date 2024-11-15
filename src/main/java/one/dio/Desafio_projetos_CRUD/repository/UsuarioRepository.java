package one.dio.Desafio_projetos_CRUD.repository;

import one.dio.Desafio_projetos_CRUD.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
