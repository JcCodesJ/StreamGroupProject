package carroll.tbel.projectspringdb.metier.dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class GameDTO {

    private String name;
    private double price;
    private int pegi;


    private List<ConsoleDTO> console;
    private EditorDTO editor;

}
