package br.com.manager.basedados.repository.corerepositoryasterisk;


import br.com.manager.basedados.models.coremodelsasterisk.PsAuths;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PsAuthsRepository extends JpaRepository<PsAuths, Integer> {
}