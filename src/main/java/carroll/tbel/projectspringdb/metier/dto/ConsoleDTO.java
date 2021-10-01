package carroll.tbel.projectspringdb.metier.dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ConsoleDTO {

    private String brand;
    private String model;
    private String manufacturer;

}
