package carroll.tbel.projectspringdb.dataAccess.modelsForm;

import carroll.tbel.projectspringdb.dataAccess.entity.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.annotation.Validated;

@EqualsAndHashCode
@ToString
@Getter @Setter
@Validated
public class UserCreateForm {
    @Length(min = 5, max = 10)
    private String username;
    @Length(min = 5, max = 10)
    private String password;

    public User mapToUser() {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        return user;
    }

}
