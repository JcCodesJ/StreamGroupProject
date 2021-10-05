package carroll.tbel.projectspringdb.metier.service.userServ;


import carroll.tbel.projectspringdb.dataAccess.entity.User;
import carroll.tbel.projectspringdb.dataAccess.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<User> findOneById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public User findOneByLogin(String username, String password) {
        System.out.println(this.repository.count());
        return this.repository.findOneByUsernameAndPassword(username, password);
    }

    @Override
    public User updateOne(Long id, User user) {
        if (user.getId() != null) {
            return this.repository.save(user);
        }
        User u = this.repository.findById(id).get();
        u.setUsername(user.getUsername());
        u.setPassword(user.getPassword());
        u.setCreatedAt(user.getCreatedAt());

        return this.repository.save(u);
    }
}