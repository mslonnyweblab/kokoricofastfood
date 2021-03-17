package br.com.agi.repository;

import br.com.agi.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {


    Optional<Usuarios> findByEmail(String email);

    Optional<Usuarios> findByNumero(String numero);
}
