package br.com.adriano_menezes.reactiveflashcards.api.mapper;

import br.com.adriano_menezes.reactiveflashcards.api.controller.request.UserRequest;
import br.com.adriano_menezes.reactiveflashcards.api.controller.response.UserResponse;
import br.com.adriano_menezes.reactiveflashcards.domain.document.UserDocument;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    UserDocument toDocument(final UserRequest request);

    UserResponse toResponse(final UserDocument document);
}
