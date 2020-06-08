package de.cmo.cache.domain.geschlecht;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GeschlechtController {

//    final CacheManager cacheManager;
//    Cache cache = cacheManager.getCache("returncode");

    final GeschlechtRepository repository;

    GeschlechtController(GeschlechtRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/geschlecht/{id}")
    String geschlecht(@PathVariable Long id) {
        Geschlecht result = repository.findById(id.longValue());
        if (result == null) {
            result = new Geschlecht();
        }
        return result.toString();
    }
}
