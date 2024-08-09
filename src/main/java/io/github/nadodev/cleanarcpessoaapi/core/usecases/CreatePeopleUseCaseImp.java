package io.github.nadodev.cleanarcpessoaapi.core.usecases;

import io.github.nadodev.cleanarcpessoaapi.core.entities.People;
import io.github.nadodev.cleanarcpessoaapi.core.getways.PeopleGetway;

public class CreatePeopleUseCaseImp implements CreatePeopleUseCase {


    private final PeopleGetway peopleGetway;

    public CreatePeopleUseCaseImp(PeopleGetway peopleGetway) {
        this.peopleGetway = peopleGetway;
    }

    @Override
    public People execute(People people) {
        return peopleGetway.create(people);
    }
}
