package de.cmo.cache.domain.geschlecht;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "geschlechter", path = "geschlechter")
interface GeschlechtRepository extends CrudRepository<Geschlecht, Long> {

    @Cacheable("geschlechter")
    Geschlecht findById(long id);

    List<Geschlecht> findByCode(String code);
}
