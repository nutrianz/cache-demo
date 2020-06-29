package de.cmo.cache;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "cachecontent")
public class CustomEndpoint {

    final CacheManager cacheManager;

    public CustomEndpoint(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @ReadOperation
    public Object showCache() {
        Cache cache = cacheManager.getCache("rezepte");
        Object nativeCache = cache.getNativeCache();
        return nativeCache;
    }
}
