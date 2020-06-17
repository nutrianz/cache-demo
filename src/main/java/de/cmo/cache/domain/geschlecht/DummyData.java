package de.cmo.cache.domain.geschlecht;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Log4j2
@Component("dummyGeschlecht")
class DummyData implements CommandLineRunner {

    final GeschlechtRepository geschlechtRepository;

    public DummyData(GeschlechtRepository geschlechtRepository) {
        this.geschlechtRepository = geschlechtRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        geschlechtRepository.save(Geschlecht.builder().code("w").bezeichnung("weiblich").build());
        geschlechtRepository.save(Geschlecht.builder().code("m").bezeichnung("männlich").build());
        geschlechtRepository.save(Geschlecht.builder().code("d").bezeichnung("divers").build());
        geschlechtRepository.save(Geschlecht.builder().code("x").bezeichnung("nix").build());

        log.info("----------------------------------------------------");
        log.info("Geschlecht: " + geschlechtRepository.findById(1L));
        log.info("Geschlecht: " + geschlechtRepository.findById(2L));
        log.info("Geschlecht: " + geschlechtRepository.findById(3L));
        log.info("Geschlecht: " + geschlechtRepository.findById(4L));
    }
}
