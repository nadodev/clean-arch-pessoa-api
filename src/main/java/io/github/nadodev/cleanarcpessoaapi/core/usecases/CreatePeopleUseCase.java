package io.github.nadodev.cleanarcpessoaapi.core.usecases;

import io.github.nadodev.cleanarcpessoaapi.core.entities.People;
import org.springframework.stereotype.Service;


@Service
public interface CreatePeopleUseCase {
   public People execute(People people);
}
