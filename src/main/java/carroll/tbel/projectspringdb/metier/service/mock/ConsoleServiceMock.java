package carroll.tbel.projectspringdb.metier.service.mock;

import carroll.tbel.projectspringdb.exceptions.ElementAlreadyPresentException;
import carroll.tbel.projectspringdb.exceptions.ElementNotFoundException;
import carroll.tbel.projectspringdb.metier.dto.ConsoleDTO;
import carroll.tbel.projectspringdb.metier.service.ConsoleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsoleServiceMock implements ConsoleService {

    @Override
    public List<ConsoleDTO> getAll() {
        return new ArrayList<>();
    }

    @Override
    public void add(ConsoleDTO toInsert) throws ElementAlreadyPresentException {
    }

    @Override
    public void delete(String s) throws ElementNotFoundException {
    }

}
