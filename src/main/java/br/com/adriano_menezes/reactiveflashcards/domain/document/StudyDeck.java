package br.com.adriano_menezes.reactiveflashcards.domain.document;

import lombok.Builder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.OffsetDateTime;
import java.util.Set;

public record StudyDeck(
                        String deckId,
                        Set<StudyCard> cards) {

    @Builder(toBuilder = true)
    public StudyDeck{}

}
