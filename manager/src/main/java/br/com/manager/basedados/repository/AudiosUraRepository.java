package br.com.manager.basedados.repository;

import br.com.manager.basedados.models.AudiosUra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudiosUraRepository extends JpaRepository<AudiosUra, Integer> {

}