package carroll.tbel.projectspringdb.metier.mapper;

import carroll.tbel.projectspringdb.dataAccess.entity.Console;
import carroll.tbel.projectspringdb.dataAccess.entity.Game;
import carroll.tbel.projectspringdb.metier.dto.ConsoleDTO;
import carroll.tbel.projectspringdb.metier.dto.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("project")
public class ConsoleMapper implements Mapper<ConsoleDTO, Console> {
    
    @Autowired
    private  Mapper<GameDTO, Game> gameMapper;
    
    @Autowired
    private Mapper<ConsoleDTO, Console> consoleMapper;

    @Override
    public ConsoleDTO entityToDto(Console console) {
        if(console == null)
            return null;

        return ConsoleDTO.builder()
                .brand(console.getBrand())
                .model(console.getModel())
                .manufacturer(console.getManufacturer())
                .build();
    }

    @Override
    public Console dtoToEntity(ConsoleDTO consoleDTO) {
        if (consoleDTO == null)
            return null;

        return Console.builder()
                .brand(consoleDTO.getBrand())
                .model(consoleDTO.getModel())
                .manufacturer(consoleDTO.getManufacturer())
                .build();
    }

}
