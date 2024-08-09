package io.github.nadodev.cleanarcpessoaapi.core.usecases;

import io.github.nadodev.cleanarcpessoaapi.core.entities.People;

public interface CreatePeopleUseCase {
   public People execute(People people);
}
