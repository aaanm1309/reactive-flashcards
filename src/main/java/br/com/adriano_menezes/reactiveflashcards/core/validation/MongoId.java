package br.com.adriano_menezes.reactiveflashcards.core.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Target({TYPE, METHOD, FIELD,ANNOTATION_TYPE,CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@Constraint(validatedBy = {MonoIdValidator.class})
public @interface MongoId {

    String message() default "{br.com.adriano_menezes.reactiveflashcards.MongoId.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}

