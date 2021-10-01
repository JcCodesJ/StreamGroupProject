package carroll.tbel.projectspringdb.metier.mapper;

import carroll.tbel.projectspringdb.dataAccess.entity.*;
import carroll.tbel.projectspringdb.metier.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@Profile("project")
public class EditorMapper implements Mapper<EditorDTO, Editor> {


    @Autowired
    private Mapper<GameDTO, Game> gameMapper;

    /*@Autowired
    private LivreMapper livreMapper;*/

    @Autowired
    private Mapper<ConsoleDTO, Console> consoleMapper;

    @Override
    public EditorDTO entityToDto(Editor editor) {
        if(editor == null)
            return null;

        return EditorDTO.builder()
                .name(editor.getName())
                .build();
    }

    @Override
    public Editor dtoToEntity(EditorDTO editorDTO) {
        if (editorDTO == null)
            return null;

        return Editor.builder()
                .name(editorDTO.getName())
                .build();
    }

}