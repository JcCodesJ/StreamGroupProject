package carroll.tbel.projectspringdb.exceptions;

public class ElementNotFoundException extends Exception {
    public ElementNotFoundException() {
        super ("This game was not found");
    }
}
