package io.github.nadodev.cleanarcpessoaapi.core.infrastructure.persistent;


import io.github.nadodev.cleanarcpessoaapi.core.enums.EnumTypePeople;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "people")
@AllArgsConstructor
@NoArgsConstructor
public class PeopleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "cpf_or_cnpj")
    private String cpfOrCnpj;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_people")
    private EnumTypePeople typePeople;

}
