package org.sid.bankaccountservice.repositories;

import org.sid.bankaccountservice.entities.BankAccount;
import org.sid.bankaccountservice.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource  //pour demarrer un web service restful qui gere entité de type bankaccount
public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
    @RestResource(path = "/bytype")
    List<BankAccount> findByType(@Param("t") AccountType type);
}
