package de.cmo.cache.domain.rezepte;

import org.springframework.data.rest.core.config.Projection;

@Projection(
        name = "customRezept",
        types = { Rezept.class })
public interface CustomRezept {

    String getName();
    String getZubereitung();
    String getBewertung();
}
