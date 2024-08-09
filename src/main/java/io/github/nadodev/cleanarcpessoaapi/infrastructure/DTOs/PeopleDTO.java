package io.github.nadodev.cleanarcpessoaapi.infrastructure.DTOs;

import io.github.nadodev.cleanarcpessoaapi.core.enums.EnumTypePeople;

public record PeopleDTO(
        String name,
        String email,
        String document,

        EnumTypePeople typePeople
) {

}
