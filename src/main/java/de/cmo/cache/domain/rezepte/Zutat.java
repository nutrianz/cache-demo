package de.cmo.cache.domain.rezepte;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Zutat {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String menge;
    private String einheit;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Rezept rezept;
}
