package de.cmo.cache.domain.rezepte;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Rezept {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String zubereitung;
    private String bewertung;
    private String angelegtVon;

//    @OneToMany(
//            mappedBy = "rezept",
////            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    private List<Zutat> zutaten = new ArrayList<>();

//    public void addZutat(Zutat zutat) {
//        zutaten.add(zutat);
//        zutat.setRezept(this);
//    }
//
//    public void removeZutat(Zutat zutat) {
//        zutaten.remove(zutat);
//        zutat.setRezept(null);
//    }
}
