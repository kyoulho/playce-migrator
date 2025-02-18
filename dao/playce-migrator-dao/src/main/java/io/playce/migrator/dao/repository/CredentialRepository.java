package io.playce.migrator.dao.repository;

import io.playce.migrator.dao.entity.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepository extends JpaRepository<Credential, Long> {

}
