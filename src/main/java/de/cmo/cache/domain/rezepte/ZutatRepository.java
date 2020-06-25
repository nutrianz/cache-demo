package de.cmo.cache.domain.rezepte;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "zutaten", path = "zutaten")
public interface ZutatRepository extends CrudRepository<Zutat, Long> {

    @Cacheable("Zutaten")
    List<Zutat> findAll();
}
