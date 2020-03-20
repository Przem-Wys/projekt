package Services;

import Repository.UserRepository;
import com.wysokinski.Projekt.Model.BaseEntity;
import com.wysokinski.Projekt.Model.Users;

public abstract class UserServiceInmpl extends BaseServiceImplem<Users,Long, UserRepository> implements UserService{


    @Override
    public Users createUser(Users users) {

        return save(users);
    }

    @Override
    public Users editUsers(Users users) {
        return save(users);
    }
}
