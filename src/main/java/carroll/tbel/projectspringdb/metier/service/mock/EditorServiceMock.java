package carroll.tbel.projectspringdb.metier.service.mock;

import carroll.tbel.projectspringdb.exceptions.ElementAlreadyPresentException;
import carroll.tbel.projectspringdb.exceptions.ElementNotFoundException;
import carroll.tbel.projectspringdb.metier.dto.EditorDTO;
import carroll.tbel.projectspringdb.metier.service.EditorService;
import org.springframework.stereotype.Service;

import java.util.List;


public class EditorServiceMock implements EditorService {

    @Override
    public List<EditorDTO> getAll() {
        return null;
    }

    @Override
    public void delete(String s) throws ElementNotFoundException {

    }

    @Override
    public void add(EditorDTO toAdd) throws ElementAlreadyPresentException {

    }
}
