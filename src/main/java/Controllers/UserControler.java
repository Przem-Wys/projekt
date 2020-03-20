package Controllers;

import Services.UserService;
import com.wysokinski.Projekt.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationEventLocator;

@RestController
@RequestMapping(value = "/user")
public class UserControler {

    @Autowired
    private UserService userService;

    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Users registry(@RequestBody Users users){
        return  userService.createUser(users);
    }

    @RequestMapping(value = "/edit",method = RequestMethod.PUT)
    public Users edit (@RequestBody Users users){
        return userService.editUsers(users);
    }

    @RequestMapping(value = "/confirm/{id}", method = RequestMethod.PUT)
    public Users confirm (@PathVariable(value = "id") Long id){ return new Users();}


}
