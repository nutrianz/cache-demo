package de.cmo.cache.domain.rezepte;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(
        excerptProjection = CustomRezept.class,
        collectionResourceRel = "rezepte",
        path = "rezepte")
public interface RezeptRepository extends CrudRepository<Rezept, Long> {

    @Cacheable("rezepte")
    List<Rezept> findAll();

    @Cacheable("rezepte")
    Optional<Rezept> findById(Long id);
}
