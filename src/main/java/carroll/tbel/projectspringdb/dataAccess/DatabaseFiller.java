package carroll.tbel.projectspringdb.dataAccess;

import carroll.tbel.projectspringdb.dataAccess.entity.Console;
import carroll.tbel.projectspringdb.dataAccess.entity.Editor;
import carroll.tbel.projectspringdb.dataAccess.entity.Game;
import carroll.tbel.projectspringdb.dataAccess.repository.ConsoleRepository;
import carroll.tbel.projectspringdb.dataAccess.repository.GameRepository;
import carroll.tbel.projectspringdb.dataAccess.repository.EditorRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatabaseFiller implements InitializingBean {

    private final GameRepository gameRepository;
    private final ConsoleRepository consoleRepository;
    private final EditorRepository editorRepository;

    public DatabaseFiller(GameRepository gameRepository, ConsoleRepository consoleRepository, EditorRepository editorRepository){
        this.gameRepository =gameRepository;
        this.consoleRepository = consoleRepository;
        this.editorRepository = editorRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        gameRepository.saveAll(List.of(
                Game.builder()
                        .name("Foxhole")
                        .price(19.99)
                        .pegi(18)
                        .build(),
                Game.builder()
                        .name("Ostranauts")
                        .price(16.79)
                        .pegi(16)
                        .build(),
                Game.builder()
                        .name("Stoneshard")
                        .price(35.99)
                        .pegi(7)
                        .build()
        ));

                consoleRepository.saveAll(List.of(
                Console.builder()
                        .brand("Playstation")
                        .model("playstation 3")
                        .manufacturer("Sony")
                        .build(),
                Console.builder()
                        .brand("XBox")
                        .model("Series X")
                        .manufacturer("Microsoft")
                        .build(),
                Console.builder()
                        .brand("Switch")
                        .model("OLED")
                        .manufacturer("Nintendo")
                        .build(),
                Console.builder()
                        .brand("Dell")
                        .model("XPS")
                        .manufacturer("PC")
                        .build()
        ));

                editorRepository.saveAll(List.of(
                Editor.builder()
                        .name("Square-Enix")
                        .build(),
                Editor.builder()
                        .name("Mojang")
                        .build(),
                Editor.builder()
                        .name("EA games")
                        .build(),
                Editor.builder()
                        .name("Paradox")
                        .build()
        ));
    }
}

/* copy,paste,add pre-populated info for Game
                Game.builder()
                        .name("")
                        .price(00.00)
                        .pegi()
                        .build()
*/

