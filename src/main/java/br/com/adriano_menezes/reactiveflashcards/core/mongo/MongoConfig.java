package br.com.adriano_menezes.reactiveflashcards.core.mongo;

import br.com.adriano_menezes.reactiveflashcards.core.mongo.converter.DateToOffsetDataTimeConverter;
import br.com.adriano_menezes.reactiveflashcards.core.mongo.converter.OffsetDataTimeToDateConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableMongoAuditing(dateTimeProviderRef = "dateTimeProvider")
public class MongoConfig {
    @Bean
    MongoCustomConversions mongoCustomConversions(){
        final List<Converter<?,?>> converters = new ArrayList<>();
        converters.add(new OffsetDataTimeToDateConverter());
        converters.add(new DateToOffsetDataTimeConverter());
        return new MongoCustomConversions(converters);

    }

}
