package io.github.nadodev.cleanarcpessoaapi.infrastructure.controllers;

import io.github.nadodev.cleanarcpessoaapi.core.entities.People;
import io.github.nadodev.cleanarcpessoaapi.infrastructure.DTOs.PeopleDTO;
import org.springframework.stereotype.Component;


@Component
public class PeopleDTOMapper {

    public PeopleDTO toDto(People people) {
        return new PeopleDTO(
            people.name(),
            people.email(),
            people.document(),
            people.typePeople()
        );
    }

    public People toEntity(PeopleDTO peopleDTO) {
        return new People(
                null,
                peopleDTO.name(),
                peopleDTO.email(),
                peopleDTO.document(),
                peopleDTO.typePeople()
        );
    }
}
