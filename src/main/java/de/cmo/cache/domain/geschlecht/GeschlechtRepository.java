package de.cmo.cache.domain.geschlecht;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

interface GeschlechtRepository extends CrudRepository<Geschlecht, Long> {

    @Cacheable("geschlechter")
    Geschlecht findById(long id);

    List<Geschlecht> findByCode(String code);
}
