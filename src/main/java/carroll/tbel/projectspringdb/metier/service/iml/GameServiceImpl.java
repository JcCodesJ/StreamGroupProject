package carroll.tbel.projectspringdb.metier.service.iml;

import carroll.tbel.projectspringdb.dataAccess.entity.Game;
import org.springframework.stereotype.Service;
import carroll.tbel.projectspringdb.dataAccess.repository.GameRepository;
import carroll.tbel.projectspringdb.metier.dto.GameDTO;
import carroll.tbel.projectspringdb.exceptions.*;
import carroll.tbel.projectspringdb.metier.mapper.GameMapper;
import carroll.tbel.projectspringdb.metier.service.GameService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameServiceImpl implements GameService {

    private final GameMapper mapper;
    private final GameRepository repository;

    public GameServiceImpl(GameMapper mapper, GameRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public List<GameDTO> getAll() {
        return repository.findAll().stream()
                .map(mapper::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public void add(GameDTO toAdd)  {
        repository.save( mapper.dtoToEntity(toAdd) );
    }

    @Override
    public void delete(String id) throws ElementNotFoundException {
        if( !repository.existsById(id) )
            throw new ElementNotFoundException();

        repository.deleteById(id);
    }
}
