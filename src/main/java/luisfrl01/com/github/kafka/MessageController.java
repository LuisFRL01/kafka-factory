package luisfrl01.com.github.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
public class MessageController {

    @Value("${topico.nome}")
    private String topico;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public void publish(@RequestBody MessageRequest messageRequest){
        kafkaTemplate.send(topico, messageRequest.message());
    }
}
