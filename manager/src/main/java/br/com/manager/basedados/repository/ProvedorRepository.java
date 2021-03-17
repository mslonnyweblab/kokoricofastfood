package br.com.manager.basedados.repository;

import br.com.manager.basedados.models.Provedor;
import br.com.manager.basedados.models.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProvedorRepository extends JpaRepository<Provedor, Integer> {

    Optional<Provedor> findByDominioPrincipal(String dominio);

    List<Provedor> findByTelefoneNumero(String numero);


    Telefone findByTelefoneId(String numero);

}