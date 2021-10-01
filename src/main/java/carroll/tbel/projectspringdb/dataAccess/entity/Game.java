package carroll.tbel.projectspringdb.dataAccess.entity;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Game {

    @Id


    @Column(unique = true, nullable = false)
    private String name;

    @Column(columnDefinition = "DECIMAL(10,2)", nullable = false)
    private double price;

    @Column(nullable = false)
    private int pegi;

    @ManyToMany
    private List<Console> consoles;
    /*@JoinTable(
            name = "cree_par",
            joinColumns = @JoinColumn(name = "isbn"),
            inverseJoinColumns = @JoinColumn(name = "auteur_id")
    )*/

    @ManyToOne
    @JoinColumn(name = "editor")
    private Editor editor;
}
