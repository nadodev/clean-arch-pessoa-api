package io.github.nadodev.cleanarcpessoaapi.core.infrastructure.controllers;

import io.github.nadodev.cleanarcpessoaapi.core.entities.People;
import io.github.nadodev.cleanarcpessoaapi.core.infrastructure.DTOs.PeopleDTO;
import org.springframework.stereotype.Component;


@Component
public class PeopleDTOMapper {

    public PeopleDTO toDto(People people) {
        return new PeopleDTO(
            people.name(),
            people.email(),
            people.cpfOrCnpj(),
            people.typePeople()
        );
    }

    public People toEntity(PeopleDTO peopleDTO) {
        return new People(
                null,
                peopleDTO.name(),
                peopleDTO.email(),
                peopleDTO.cpfOrCnpj(),
                peopleDTO.typePeople()
        );
    }
}
