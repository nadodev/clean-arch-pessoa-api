package io.github.nadodev.cleanarcpessoaapi.core.infrastructure.controllers;


import io.github.nadodev.cleanarcpessoaapi.core.entities.People;
import io.github.nadodev.cleanarcpessoaapi.core.infrastructure.DTOs.PeopleDTO;
import io.github.nadodev.cleanarcpessoaapi.core.usecases.CreatePeopleUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
@AllArgsConstructor
public class PeopleController {

    private  final CreatePeopleUseCase createPeopleUseCase;

    private final PeopleDTOMapper peopleDTOMapper;

    public PeopleDTO create(@RequestBody  PeopleDTO peopleDTO) {
        People newPeople =  createPeopleUseCase.execute(peopleDTOMapper.toEntity(peopleDTO));
        return peopleDTOMapper.toDto(newPeople);
    }

}
