package de.cmo.cache.web;

import de.cmo.cache.domain.geschlecht.GeschlechtService;
import de.cmo.cache.domain.returncode.ReturncodeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeschlechtController {

//    final CacheManager cacheManager;
//    Cache cache = cacheManager.getCache("returncode");

    final GeschlechtService geschlechtService;
    final ReturncodeService returncodeService;

    public GeschlechtController(GeschlechtService geschlechtService, ReturncodeService returncodeService) {
        this.geschlechtService = geschlechtService;
        this.returncodeService = returncodeService;
    }

    @GetMapping("/geschlecht/{id}")
    String geschlecht(@PathVariable Long id) {
        return geschlechtService.getGeschlecht(id).toString();
    }

    @GetMapping("/returncode/{id}")
    String returncode(@PathVariable Long id) {
        return returncodeService.getReturncode(id).toString();
    }
}
