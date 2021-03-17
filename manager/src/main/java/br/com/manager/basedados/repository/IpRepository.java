package br.com.manager.basedados.repository;

import br.com.manager.basedados.models.Ip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpRepository extends JpaRepository<Ip, Integer> {
    Ip findByIp(String ip);

}