package carroll.tbel.projectspringdb.metier.service;

import carroll.tbel.projectspringdb.exceptions.ElementAlreadyPresentException;
import carroll.tbel.projectspringdb.metier.dto.EditorDTO;

public interface EditorService extends CrudService<EditorDTO, String> {

    void add(EditorDTO toAdd) throws ElementAlreadyPresentException;

}
