package de.cmo.cache.domain.geschlecht;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Log4j2
@Component
class DummyData implements CommandLineRunner {

    final GeschlechtRepository geschlechtRepository;

    public DummyData(GeschlechtRepository geschlechtRepository) {
        this.geschlechtRepository = geschlechtRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        geschlechtRepository.save(new Geschlecht("w", "weiblich"));
        geschlechtRepository.save(new Geschlecht("m", "mänlich"));
        geschlechtRepository.save(new Geschlecht("d", "divers"));
        geschlechtRepository.save(new Geschlecht("x", "nix"));

        log.info("----------------------------------------------------");
        log.info("Geschlecht: " + geschlechtRepository.findById(1L));
        log.info("Geschlecht: " + geschlechtRepository.findById(2L));
        log.info("Geschlecht: " + geschlechtRepository.findById(3L));
        log.info("Geschlecht: " + geschlechtRepository.findById(4L));
    }
}
