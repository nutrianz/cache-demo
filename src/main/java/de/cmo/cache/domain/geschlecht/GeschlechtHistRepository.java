package de.cmo.cache.domain.geschlecht;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "geschlechterHist", path = "geschlechterHist")
public interface GeschlechtHistRepository extends CrudRepository<GeschlechtHist, Long> {
}
