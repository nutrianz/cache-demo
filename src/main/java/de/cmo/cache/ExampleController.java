package de.cmo.cache;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    final CacheManager cacheManager;

    public ExampleController(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @GetMapping("/cache")
    public Object showCache() {
        Cache cache = cacheManager.getCache("rezepte");
        Object nativeCache = cache.getNativeCache();
        return nativeCache;
    }

    @GetMapping("/hallo")
    public String helloWorld() {
        return "Hallo World";
    }
}
