package de.cmo.cache.domain.geschlecht;

import org.springframework.stereotype.Service;

@Service
class GeschlechtService {

    final GeschlechtRepository repository;

    public GeschlechtService(GeschlechtRepository repository) {
        this.repository = repository;
    }

    public Geschlecht getGeschlecht(long id) {
        Geschlecht result = repository.findById(id);
        if (result == null) {
            result = new Geschlecht();
        }
        return result;
    }
}
