package de.cmo.cache.domain.returncode;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Log4j2
@Component("dummyReturncode")
class DummyData implements CommandLineRunner {

    final ReturncodeRepository returncodeRepository;

    public DummyData(ReturncodeRepository returncodeRepository) {
        this.returncodeRepository = returncodeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
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
