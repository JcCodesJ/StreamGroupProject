package carroll.tbel.projectspringdb.exceptions;

public class ElementAlreadyPresentException extends Exception{

    public ElementAlreadyPresentException() {
        super("This game already exists");
    }
}
