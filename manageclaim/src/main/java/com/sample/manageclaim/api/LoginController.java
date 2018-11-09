package com.sample.manageclaim.api;

import com.sample.manageclaim.api.dao.UserJdbcRepository;
import com.sample.manageclaim.api.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    UserJdbcRepository userJdbcRepository;


    @RequestMapping( method= RequestMethod.GET)
    public User getUser(@RequestParam("name") String name){
        List<User> users = userJdbcRepository.findByName(name);
        User user = null;
        if(!users.isEmpty()){
            user = users.get(0);
        }
        return user;
    }


    @RequestMapping(path="/addusers", method= RequestMethod.GET)
    public void addUsers(){
        User user1 = new User();
        user1.setId(100l);
        user1.setName("bindu");
        user1.setPassword("bindu");
        userJdbcRepository.save(user1);

        User user2 = new User();
        user2.setId(101l);
        user2.setName("statefarm");
        user2.setPassword("statefarm");
        userJdbcRepository.save(user2);
    }




}
