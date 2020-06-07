package de.cmo.cache.domain.returncode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ReturncodeController {

//    final CacheManager cacheManager;
//    Cache cache = cacheManager.getCache("returncode");

    final ReturncodeService service;

    public ReturncodeController(ReturncodeService service) {
        this.service = service;
    }

    @GetMapping("/returncode/{id}")
    String returncode(@PathVariable Long id) {
        return service.getReturncode(id).toString();
    }
}
