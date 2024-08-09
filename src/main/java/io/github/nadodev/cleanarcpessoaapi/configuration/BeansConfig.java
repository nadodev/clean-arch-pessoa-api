package io.github.nadodev.cleanarcpessoaapi.configuration;

import io.github.nadodev.cleanarcpessoaapi.core.getways.PeopleGetway;
import io.github.nadodev.cleanarcpessoaapi.core.usecases.CreatePeopleUseCase;
import io.github.nadodev.cleanarcpessoaapi.core.usecases.CreatePeopleUseCaseImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CreatePeopleUseCase createPessoaUseCase(PeopleGetway peopleGetway) {
        return new CreatePeopleUseCaseImp(peopleGetway);
    }
}