package de.cmo.cache.domain.returncode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ReturncodeController {

//    final CacheManager cacheManager;
//    Cache cache = cacheManager.getCache("returncode");

    final ReturncodeRepository repository;

    ReturncodeController(ReturncodeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/returncode/{id}")
    String returncode(@PathVariable Long id) {
        Returncode result = repository.findById(id.longValue());
        if (result == null) {
            result = new Returncode();
        }
        return result.toString();
    }
}
