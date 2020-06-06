package de.cmo.cache.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

@Service
public class GeschlechtService {

    @Autowired
    GeschlechtRepository repository;

    @Autowired
    CacheManager cacheManager;

    public Geschlecht getGeschlecht(long id) {
        Cache cache = cacheManager.getCache("geschlecht");
        Geschlecht result = repository.findById(id);
        if (result == null) {
            result = new Geschlecht();
        }
        return result;
    }
}
