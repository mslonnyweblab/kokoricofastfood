package br.com.manager.basedados.repository;

import br.com.manager.basedados.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Transactional
    Optional<Usuario> findByEmail(String email);
}