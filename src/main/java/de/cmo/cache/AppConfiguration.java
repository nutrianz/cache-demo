package de.cmo.cache;

import lombok.extern.log4j.Log4j2;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Log4j2
@Component
public class AppConfiguration {

    final CacheManager cacheManager;

    public AppConfiguration(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

//    public void evictSingleCacheValue(String cacheName, String cacheKey) {
//        cacheManager.getCache(cacheName).evict(cacheKey);
//    }
//
//    public void evictAllCacheValues(String cacheName) {
//        cacheManager.getCache(cacheName).clear();
//    }

    public void evictAllCaches() {
        cacheManager.getCacheNames().stream()
                .forEach(cacheName -> cacheManager.getCache(cacheName).clear());
    }

    @Scheduled(fixedRate = 6000)
    @CacheEvict(value = "rezepte", allEntries = true)
    public void clearCache() {
        log.info("Reset Rezepte Cache: The time is now {}", LocalDate.now());
    }

    @Scheduled(fixedRate = 20000)
    public void evictAllcachesAtIntervals() {
        log.info("Reset all Caches: The time is now {}", LocalDate.now());
        evictAllCaches();
    }

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("Time-Scheduler: The time is now {}", LocalDate.now());
    }
}
