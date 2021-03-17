package br.com.manager.basedados.repository;


import br.com.manager.basedados.models.Contexto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContextoRepository extends JpaRepository<Contexto, Integer> {

}