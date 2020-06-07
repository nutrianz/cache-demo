package de.cmo.cache.domain.returncode;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

interface ReturncodeRepository extends CrudRepository<Returncode, Long> {

    @Cacheable("returncodes")
    Returncode findById(long id);

    List<Returncode> findByCode(String code);
}
