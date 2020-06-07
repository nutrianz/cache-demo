package de.cmo.cache.domain.geschlecht;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@ToString
@NoArgsConstructor
@Entity
class Geschlecht {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String bezeichnung;

    public Geschlecht(String code, String bezeichnung) {
        this.code = code;
        this.bezeichnung = bezeichnung;
    }
}
