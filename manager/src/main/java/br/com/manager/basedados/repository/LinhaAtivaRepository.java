package br.com.manager.basedados.repository;

import br.com.manager.basedados.models.LinhaAtiva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinhaAtivaRepository extends JpaRepository<LinhaAtiva, Integer> {

}