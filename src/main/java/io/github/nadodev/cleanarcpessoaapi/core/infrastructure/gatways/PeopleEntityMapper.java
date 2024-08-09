package io.github.nadodev.cleanarcpessoaapi.core.infrastructure.gatways;


import io.github.nadodev.cleanarcpessoaapi.core.entities.People;
import io.github.nadodev.cleanarcpessoaapi.core.infrastructure.persistent.PeopleEntity;
import org.springframework.stereotype.Component;

@Component
public class PeopleEntityMapper {

        public PeopleEntity toEntity(People people) {
            return new PeopleEntity(
                    people.id(),
                    people.name(),
                    people.email(),
                    people.cpfOrCnpj(),
                    people.typePeople()
            );
        }

        public People toPeople(PeopleEntity peopleEntity) {
            return new People(
                    peopleEntity.getId(),
                    peopleEntity.getName(),
                    peopleEntity.getEmail(),
                    peopleEntity.getCpfOrCnpj(),
                    peopleEntity.getTypePeople()
            );
        }
}
