package io.github.nadodev.cleanarcpessoaapi.infrastructure.gatways;


import io.github.nadodev.cleanarcpessoaapi.core.entities.People;
import io.github.nadodev.cleanarcpessoaapi.infrastructure.persistent.PeopleEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PeopleEntityMapper {

        public PeopleEntity toEntity(People people) {
            return new PeopleEntity(
                    people.id(),
                    people.name(),
                    people.email(),
                    people.document(),
                    people.typePeople()
            );
        }

        public People toPeople(PeopleEntity peopleEntity) {
            return new People(
                    peopleEntity.getId(),
                    peopleEntity.getName(),
                    peopleEntity.getEmail(),
                    peopleEntity.getDocument(),
                    peopleEntity.getTypePeople()
            );
        }
}
