package br.com.manager.basedados.repository;

import br.com.manager.basedados.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresasRepository extends JpaRepository<Empresa, Integer> {

}