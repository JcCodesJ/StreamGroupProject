package carroll.tbel.projectspringdb.dataAccess.repository;

import carroll.tbel.projectspringdb.dataAccess.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findOneByUsernameAndPassword(String username, String password);
}