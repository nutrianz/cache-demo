package de.cmo.cache.domain.returncode;

import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ToString
@NoArgsConstructor
@Entity
class Returncode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String code;
    String bezeichnung;

    public Returncode(String code, String bezeichnung) {
        this.code = code;
        this.bezeichnung = bezeichnung;
    }
}
