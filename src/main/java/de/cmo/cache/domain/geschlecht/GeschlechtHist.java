package de.cmo.cache.domain.geschlecht;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class GeschlechtHist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String langtext;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Geschlecht geschlecht;
}
