package carroll.tbel.projectspringdb.dataAccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import carroll.tbel.projectspringdb.dataAccess.entity.Game;

public interface GameRepository extends JpaRepository<Game, String> {
}
