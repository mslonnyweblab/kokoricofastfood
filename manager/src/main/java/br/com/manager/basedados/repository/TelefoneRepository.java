package br.com.manager.basedados.repository;

import br.com.manager.basedados.models.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Integer> {

    Optional<Telefone> findByNumero(String numero);

}