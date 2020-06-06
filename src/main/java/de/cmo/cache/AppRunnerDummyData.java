package de.cmo.cache;

import de.cmo.cache.domain.geschlecht.Geschlecht;
import de.cmo.cache.domain.geschlecht.GeschlechtRepository;
import de.cmo.cache.domain.returncode.Returncode;
import de.cmo.cache.domain.returncode.ReturncodeRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class AppRunnerDummyData implements CommandLineRunner {

    final GeschlechtRepository geschlechtRepository;
    final ReturncodeRepository returncodeRepository;

    public AppRunnerDummyData(GeschlechtRepository geschlechtRepository, ReturncodeRepository returncodeRepository) {
        this.geschlechtRepository = geschlechtRepository;
        this.returncodeRepository = returncodeRepository;
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

        returncodeRepository.save(new Returncode("000001", "Falscher Fehler"));
        returncodeRepository.save(new Returncode("000002", "Richtiger Fehler"));
        returncodeRepository.save(new Returncode("000003", "Ganz Falsch"));
        returncodeRepository.save(new Returncode("000004", "So doch nicht"));

        log.info("----------------------------------------------------");
        log.info("Returncode: " + returncodeRepository.findById(1L));
        log.info("Returncode: " + returncodeRepository.findById(2L));
        log.info("Returncode: " + returncodeRepository.findById(3L));
        log.info("Returncode: " + returncodeRepository.findById(4L));
    }
}
