package br.com.adriano_menezes.reactiveflashcards.api.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public record UserRequest(@NotBlank
                            @Size(min = 1,max = 100)
                            @JsonProperty("name")
                            String name,
                            @NotBlank
                            @Size(min = 1,max = 255)
                            @JsonProperty("email")
                            String email) {

    @Builder(toBuilder = true)
    public UserRequest {}
}
