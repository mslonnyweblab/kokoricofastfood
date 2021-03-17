package br.com.acesso.baseCredentials.repository;

import br.com.acesso.baseCredentials.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Roles, Long> {
}
