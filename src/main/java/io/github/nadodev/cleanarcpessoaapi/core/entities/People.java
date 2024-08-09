package io.github.nadodev.cleanarcpessoaapi.core.entities;

import io.github.nadodev.cleanarcpessoaapi.core.enums.EnumTypePeople;

public record People(Long id, String name, String email, String cpfOrCnpj, EnumTypePeople typePeople) {

}
