package io.github.nadodev.cleanarcpessoaapi.core.infrastructure.gatways;

import io.github.nadodev.cleanarcpessoaapi.core.entities.People;
import io.github.nadodev.cleanarcpessoaapi.core.getways.PeopleGetway;
import io.github.nadodev.cleanarcpessoaapi.core.infrastructure.persistent.PeopleEntity;
import io.github.nadodev.cleanarcpessoaapi.core.infrastructure.persistent.PeopleRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Component
public class PeopleRepositoryGatway  implements PeopleGetway {


    private final PeopleRepository peopleRepository;

    private final PeopleEntityMapper peopleEntityMapper;

    @Override
    public People create(People people) {

        PeopleEntity entity = peopleEntityMapper.toEntity(people);
        PeopleEntity newPeople = peopleRepository.save(entity);
        return peopleEntityMapper.toPeople(newPeople);
    }
}
