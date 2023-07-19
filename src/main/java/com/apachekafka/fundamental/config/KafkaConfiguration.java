package com.apachekafka.fundamental.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

//Bunların hepsi default konfigurasyonlar.
//Kafka konfigürasyon ayarlarımızı bu class'da gerceklestiriyoruz.

@Configuration
public class KafkaConfiguration {
    //Value anotasyonu ile serverAddress'imizi application.properties'de ki kafka-server'ımza atadık.
    @Value(value = "${kafka.server}")
    private String serverAddress;

    //Kafka admin'imizi olusturuyoruz.
    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();

        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, serverAddress); //Yeni bir kafka admin oluşturmak için map'imizin key'ine olması gereken konfigürasyon adını yani AdminClie...'ımızı ekleyip value'si serverAddress'e atıyoruz.

        return new KafkaAdmin(configs);
    }

    //Topic'imizi oluşturacagiz.
    @Bean
    public NewTopic topic() {
        return new NewTopic("appTopic", 1, (short) 1); //Topic'i oluştururken bir isim num partition ve replication factor'de oluşturmamız gerekiyor. İsmimiz zaten serverAddress diğer iki deger ise default 1, 1 olarak ayarlıyoruz daha sonrasında çıkan hata ampulüne tıklayıp short'a cast ediyoruz.
    }
}
