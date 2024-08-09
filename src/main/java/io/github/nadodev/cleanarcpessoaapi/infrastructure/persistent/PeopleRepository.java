package io.github.nadodev.cleanarcpessoaapi.infrastructure.persistent;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository  extends JpaRepository<PeopleEntity, Long> {

    PeopleEntity findByDocument(String document);
}
