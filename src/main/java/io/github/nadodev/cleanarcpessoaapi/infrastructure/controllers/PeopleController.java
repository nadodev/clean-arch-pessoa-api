package io.github.nadodev.cleanarcpessoaapi.infrastructure.controllers;


import io.github.nadodev.cleanarcpessoaapi.core.entities.People;
import io.github.nadodev.cleanarcpessoaapi.infrastructure.DTOs.PeopleDTO;
import io.github.nadodev.cleanarcpessoaapi.core.usecases.CreatePeopleUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api")
@AllArgsConstructor
public class PeopleController {

    private final CreatePeopleUseCase createPeopleUseCase;
    private final PeopleDTOMapper peopleDTOMapper;

    @PostMapping("/people")
    public PeopleDTO create(@RequestBody  PeopleDTO peopleDTO) {
        People newPeople =  createPeopleUseCase.execute(peopleDTOMapper.toEntity(peopleDTO));
        return peopleDTOMapper.toDto(newPeople);
    }



}
