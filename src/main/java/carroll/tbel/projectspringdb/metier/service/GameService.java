package carroll.tbel.projectspringdb.metier.service;

import carroll.tbel.projectspringdb.exceptions.ElementAlreadyPresentException;
import carroll.tbel.projectspringdb.metier.dto.GameDTO;

public interface GameService extends CrudService<GameDTO, String>{

    void add(GameDTO toAdd) throws ElementAlreadyPresentException;
}
