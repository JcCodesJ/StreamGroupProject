package carroll.tbel.projectspringdb.metier.service;

import carroll.tbel.projectspringdb.exceptions.*;
import java.util.List;

public interface CrudService<DTO, ID> {

    //Read
    //DTO getOne(ID id) throws ElementNotFoundException;
    List<DTO> getAll();

    // Create
    void add(DTO toInsert) throws ElementAlreadyPresentException;

    // Delete
    void delete(ID id) throws ElementNotFoundException;

    // Update
    //void update(DTO toUpdate) throws ElementNotFoundException;
}
