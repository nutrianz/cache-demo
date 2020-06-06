package de.cmo.cache.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeschlechtController {

    @Autowired
    GeschlechtService geschlechtService;

    @GetMapping("/geschlecht/{id}")
    String hello(@PathVariable Long id) {
        return geschlechtService.getGeschlecht(id).toString();
    }
}
