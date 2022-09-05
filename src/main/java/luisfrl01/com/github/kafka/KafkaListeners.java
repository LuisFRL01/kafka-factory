package luisfrl01.com.github.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "${topico.nome}", groupId = "grupo1")
    void listener(String data){
        System.out.println("Recebido: " + data);
    }
}
