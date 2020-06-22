package de.cmo.cache;


import de.cmo.cache.domain.geschlecht.GeschlechtHistRepository;
import de.cmo.cache.domain.geschlecht.GeschlechtRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class AppStartupRunner implements ApplicationRunner {

    private final GeschlechtHistRepository geschlechtHistRepository;
    private final GeschlechtRepository geschlechtRepository;

    public AppStartupRunner(GeschlechtHistRepository geschlechtHistRepository, GeschlechtRepository geschlechtRepository) {
        this.geschlechtHistRepository = geschlechtHistRepository;
        this.geschlechtRepository = geschlechtRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        var allHistorien = geschlechtHistRepository.findAll();
        allHistorien.forEach(h -> System.out.println("Historien: " + h.toString()));

        var allGeschlechter = geschlechtRepository.findAll();
        allGeschlechter.forEach(r -> System.out.println("Referenzen: " + r.toString()));
    }
}
