package io.github.nadodev.cleanarcpessoaapi.core.usecases;

import io.github.nadodev.cleanarcpessoaapi.core.entities.People;
import io.github.nadodev.cleanarcpessoaapi.core.exceptions.BusinessException;
import io.github.nadodev.cleanarcpessoaapi.core.getways.PeopleGetway;

public class CreatePeopleUseCaseImp implements CreatePeopleUseCase {


    private final PeopleGetway peopleGetway;

    public CreatePeopleUseCaseImp(PeopleGetway peopleGetway) {
        this.peopleGetway = peopleGetway;
    }

    @Override
    public People execute(People people) {
        People  peopleExists = peopleGetway.findByDocument(people.document());

        if(peopleExists != null) {
            throw new BusinessException("Já existe uma pessoa com CPF/CNPJ "+people.document() + " cadastrado!");
        }


        return peopleGetway.create(people);
    }
}
