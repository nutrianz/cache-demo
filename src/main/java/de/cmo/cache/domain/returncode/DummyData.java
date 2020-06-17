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
        ;
        returncodeRepository.save(Returncode.builder().code("0000001").bezeichnung("Falscher Fehler").build());
        returncodeRepository.save(Returncode.builder().code("0000002").bezeichnung("Richtiger Fehler").build());
        returncodeRepository.save(Returncode.builder().code("0000003").bezeichnung("Ganz Falsch").build());
        returncodeRepository.save(Returncode.builder().code("0000004").bezeichnung("So doch nicht").build());

        log.info("----------------------------------------------------");
        log.info("Returncode: " + returncodeRepository.findById(1L));
        log.info("Returncode: " + returncodeRepository.findById(2L));
        log.info("Returncode: " + returncodeRepository.findById(3L));
        log.info("Returncode: " + returncodeRepository.findById(4L));
    }
}
