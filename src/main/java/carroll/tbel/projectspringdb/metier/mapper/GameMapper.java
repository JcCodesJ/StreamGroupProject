package carroll.tbel.projectspringdb.metier.mapper;

import carroll.tbel.projectspringdb.dataAccess.entity.Editor;
import carroll.tbel.projectspringdb.dataAccess.entity.*;
import carroll.tbel.projectspringdb.metier.dto.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@Getter @Setter
//@Profile("project")
public class GameMapper implements Mapper<GameDTO, Game> {

    @Autowired
    private Mapper<EditorDTO, Editor> editorMapper;
    @Autowired
    private Mapper<ConsoleDTO, Console> consoleMapper;

    @Override
    public GameDTO entityToDto(Game game) {
        if(game == null)
            return null;

        return GameDTO.builder()
                .name(game.getName())
                .price(game.getPrice())
                .pegi(game.getPegi())
                .build();
    }

    @Override
    public Game dtoToEntity(GameDTO gameDTO) {
        if (gameDTO == null)
        return null;

        return Game.builder()
                .name(gameDTO.getName())
                .price(gameDTO.getPrice())
                .pegi(gameDTO.getPegi())
                .build();
    }

    }