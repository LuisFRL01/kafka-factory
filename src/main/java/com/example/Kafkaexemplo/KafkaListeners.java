package com.example.Kafkaexemplo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "meuTopico", groupId = "grupo1")
    void listener(String data){
        System.out.println("Recebido: " + data);
    }
}
