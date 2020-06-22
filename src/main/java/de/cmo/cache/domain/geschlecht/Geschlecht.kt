package de.cmo.cache.domain.geschlecht

import javax.persistence.*

@Entity
class Geschlecht {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
    val code: String? = null
    val bezeichnung: String? = null

    @OneToMany(mappedBy = "geschlecht", cascade = [CascadeType.ALL], orphanRemoval = true)
    val geschlechtHists: List<GeschlechtHist>? = null
}