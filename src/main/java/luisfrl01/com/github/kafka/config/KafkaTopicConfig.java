package luisfrl01.com.github.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${topico.nome}")
    private String topico;

    @Bean
    public NewTopic meuTopico(){
        return TopicBuilder.name(topico).build();
    }
}
