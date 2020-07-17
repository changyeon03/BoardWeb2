package BoardWeb.controller;

import BoardWeb.dto.UserDTO;
import BoardWeb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHome() { return "User/login"; }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin(){
        return "User/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String postLogin(@RequestBody UserDTO userDTO) throws Exception {
        if(userService.isUser(userDTO))
        {
            return "/Board/viewboardlist";
        }
        else
            return "User/login";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String getSignup(){
        return "User/signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String postSignup(@RequestBody UserDTO userDTO) throws Exception {
        userService.insertUser(userDTO);
        return "User/login";
    }
}
