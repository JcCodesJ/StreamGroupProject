package carroll.tbel.projectspringdb.metier.service.iml;

import carroll.tbel.projectspringdb.dataAccess.repository.ConsoleRepository;
import carroll.tbel.projectspringdb.exceptions.ElementNotFoundException;
import carroll.tbel.projectspringdb.metier.dto.ConsoleDTO;
import carroll.tbel.projectspringdb.metier.mapper.ConsoleMapper;
import carroll.tbel.projectspringdb.metier.service.ConsoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConsoleServiceImpl implements ConsoleService {
    private final ConsoleRepository repository;
    private final ConsoleMapper mapper;

    public ConsoleServiceImpl(ConsoleRepository repository, ConsoleMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<ConsoleDTO> getAll() {
        return repository.findAll().stream()
                .map( mapper::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public void add(ConsoleDTO toAdd) {
        repository.save( mapper.dtoToEntity(toAdd) );
    }

    @Override
    public void delete(String s) throws ElementNotFoundException {

    }
}
