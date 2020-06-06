package de.cmo.cache.domain.returncode;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@NoArgsConstructor
@Entity
public class Returncode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String bezeichnung;

    public Returncode(String code, String bezeichnung) {
        this.code = code;
        this.bezeichnung = bezeichnung;
    }
}
