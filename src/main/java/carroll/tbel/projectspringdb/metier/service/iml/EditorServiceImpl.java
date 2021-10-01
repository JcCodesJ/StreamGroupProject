package carroll.tbel.projectspringdb.metier.service.iml;

import carroll.tbel.projectspringdb.dataAccess.repository.EditorRepository;
import carroll.tbel.projectspringdb.exceptions.ElementAlreadyPresentException;
import carroll.tbel.projectspringdb.exceptions.ElementNotFoundException;
import carroll.tbel.projectspringdb.metier.dto.EditorDTO;
import carroll.tbel.projectspringdb.metier.mapper.EditorMapper;
import carroll.tbel.projectspringdb.metier.service.EditorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EditorServiceImpl implements EditorService {
    private final EditorRepository repository;
    private final EditorMapper mapper;

    public EditorServiceImpl(EditorRepository repository, EditorMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<EditorDTO> getAll() {
        return repository.findAll().stream()
                .map( mapper::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public void add(EditorDTO toAdd)  {
        repository.save( mapper.dtoToEntity(toAdd) );
    }

    @Override
    public void delete(String s) throws ElementNotFoundException {

    }
}