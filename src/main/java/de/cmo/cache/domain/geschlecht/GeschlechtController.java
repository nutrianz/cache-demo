package de.cmo.cache.domain.geschlecht;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GeschlechtController {

//    final CacheManager cacheManager;
//    Cache cache = cacheManager.getCache("returncode");

    final GeschlechtService service;

    public GeschlechtController(GeschlechtService service) {
        this.service = service;
    }

    @GetMapping("/geschlecht/{id}")
    String geschlecht(@PathVariable Long id) {
        return service.getGeschlecht(id).toString();
    }
}
