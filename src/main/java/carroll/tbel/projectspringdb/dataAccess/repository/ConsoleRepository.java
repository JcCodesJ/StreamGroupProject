package carroll.tbel.projectspringdb.dataAccess.repository;

import carroll.tbel.projectspringdb.dataAccess.entity.Console;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsoleRepository extends JpaRepository<Console, String> {
}
