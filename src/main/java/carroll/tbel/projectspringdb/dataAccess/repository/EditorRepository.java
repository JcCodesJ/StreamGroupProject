package carroll.tbel.projectspringdb.dataAccess.repository;

import carroll.tbel.projectspringdb.dataAccess.entity.Editor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditorRepository extends JpaRepository<Editor, String> {
}
