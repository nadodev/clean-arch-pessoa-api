package io.github.nadodev.cleanarcpessoaapi.core.getways;

import io.github.nadodev.cleanarcpessoaapi.core.entities.People;

public interface PeopleGetway {
    People create(People people);

    People findByDocument(String document);

}
