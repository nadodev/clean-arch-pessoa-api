package io.github.nadodev.cleanarcpessoaapi.core.infrastructure.persistent;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository  extends JpaRepository<PeopleEntity, Long> {

}
