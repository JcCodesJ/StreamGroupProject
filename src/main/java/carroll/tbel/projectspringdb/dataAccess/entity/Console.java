package carroll.tbel.projectspringdb.dataAccess.entity;

import lombok.*;

import javax.persistence.*;
import java.lang.annotation.Target;
import java.util.List;


@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Console {

    @Id

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private String manufacturer;

    @ManyToMany(mappedBy = "consoles", fetch = FetchType.EAGER)
    private List<Game> game;

}
