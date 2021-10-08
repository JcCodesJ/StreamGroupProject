package carroll.tbel.projectspringdb.metier.service.mock;

import carroll.tbel.projectspringdb.exceptions.ElementAlreadyPresentException;
import carroll.tbel.projectspringdb.exceptions.ElementNotFoundException;
import carroll.tbel.projectspringdb.metier.dto.GameDTO;
import carroll.tbel.projectspringdb.metier.service.GameService;
import org.springframework.stereotype.Service;

import java.util.List;


public class GameServiceMock implements GameService {

    @Override
    public List<GameDTO> getAll() {
        return null;
    }

    @Override
    public void delete(String s) throws ElementNotFoundException {

    }

    @Override
    public void add(GameDTO toAdd) throws ElementAlreadyPresentException {

    }
}
