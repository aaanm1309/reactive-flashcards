package br.com.adriano_menezes.reactiveflashcards.domain.service;

import br.com.adriano_menezes.reactiveflashcards.domain.document.UserDocument;
import br.com.adriano_menezes.reactiveflashcards.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Slf4j
@Service
public class UserService {
    private final UserRepository userRepository;

    public Mono<UserDocument> save(final UserDocument document){
        return userRepository.save(document)
                .doFirst(()-> log.info("=== try to save a follow document {}",document));

    }
}
