package carroll.tbel.projectspringdb.dataAccess.entity;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Editor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "editor",fetch = FetchType.EAGER)
    private List<Game> game;
}
