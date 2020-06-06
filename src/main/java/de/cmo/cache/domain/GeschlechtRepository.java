package de.cmo.cache.domain;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GeschlechtRepository extends JpaRepository<Geschlecht, Long> {

    @Cacheable("geschlecht")
    Geschlecht findById(long id);

    List<Geschlecht> findByCode(String code);
}
