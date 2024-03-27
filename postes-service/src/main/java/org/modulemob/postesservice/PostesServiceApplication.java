package org.modulemob.postesservice;

import org.modulemob.postesservice.entities.Poste;
import org.modulemob.postesservice.repository.PosteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class PostesServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostesServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(PosteRepository posteRepository){
        return args -> {
            posteRepository.save(Poste.builder()
                    .id(UUID.randomUUID().toString())
                    .titre("java developer")
                    .status(true)
                    .description("open for recruit")
                    .build());
            posteRepository.save(Poste.builder()
                    .id(UUID.randomUUID().toString())
                    .titre("php developer")
                    .status(true)
                    .description("open for recruit")
                    .build());
            posteRepository.save(Poste.builder()
                    .id(UUID.randomUUID().toString())
                    .titre("project manager")
                    .status(false)
                    .description("open for recruit")
                    .build());
        };
    }
}
