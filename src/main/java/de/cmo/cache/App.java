package de.cmo.cache;

import de.cmo.cache.domain.Geschlecht;
import de.cmo.cache.domain.GeschlechtRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@Log4j2
@EnableCaching
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Autowired
    GeschlechtRepository geschlechtRepository;

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            geschlechtRepository.save(new Geschlecht("w", "weiblich"));
            geschlechtRepository.save(new Geschlecht("m", "mänlich"));
            geschlechtRepository.save(new Geschlecht("d", "divers"));
            geschlechtRepository.save(new Geschlecht("x", "nix"));

//            // fetch all customers
//            log.info("Geschlecht gefunden mit findAll():");
//            log.info("-------------------------------");
//            for (Geschlecht geschlecht : geschlechtRepository.findAll()) {
//                log.info(geschlecht.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            Geschlecht geschlecht = geschlechtRepository.findById(1L);
//            log.info("Customer gefunden mit findById(1L):");
//            log.info("--------------------------------");
//            log.info(geschlecht.toString());
//            log.info("");
//
//            // fetch customers by last name
//            log.info("Customer gefunden mit findByCode('w'):");
//            log.info("--------------------------------------------");
//            geschlechtRepository.findByCode("w").forEach(weiblich -> {
//                log.info(weiblich.toString());
//            });
//            log.info("");
        };
    }
}
