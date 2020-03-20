package Services;

import Repository.UserRepository;
import com.wysokinski.Projekt.Model.Users;

public interface UserService extends BaseService<Users,Long, UserRepository >{

    Users createUser (Users users);
    Users editUsers (Users users);

}
