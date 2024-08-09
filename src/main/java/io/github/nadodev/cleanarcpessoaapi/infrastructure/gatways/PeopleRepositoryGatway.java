package io.github.nadodev.cleanarcpessoaapi.infrastructure.gatways;

import io.github.nadodev.cleanarcpessoaapi.core.entities.People;
import io.github.nadodev.cleanarcpessoaapi.core.getways.PeopleGetway;
import io.github.nadodev.cleanarcpessoaapi.infrastructure.persistent.PeopleEntity;
import io.github.nadodev.cleanarcpessoaapi.infrastructure.persistent.PeopleRepository;
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

    @Override
    public People findByDocument(String document) {
        PeopleEntity entity = peopleRepository.findByDocument(document);
        if (entity == null) {
            return null;
        }
        return peopleEntityMapper.toPeople(entity);
    }

}
