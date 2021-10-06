package carroll.tbel.projectspringdb;

import carroll.tbel.projectspringdb.exceptions.ElementAlreadyPresentException;
import carroll.tbel.projectspringdb.presentation.Menu;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProjectApplication {

    public static void main(String[] args) throws ElementAlreadyPresentException {

        //Container
        ApplicationContext ctx = ProjectApplication.run(ProjectApplication.class, args);

        Menu m = ctx.getBean(Menu.class);
        m.start();

    }
}