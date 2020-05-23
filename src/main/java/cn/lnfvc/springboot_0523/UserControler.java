package cn.lnfvc.springboot_0523;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot_0513
 * @description
 * @author: youyi
 * @create: 2020-05-22 19:26
 **/

@RestController
public class UserControler {
    @RequestMapping(value = "/users")
    public String findAllUsers(){
        return "users is here 1234";
    }

}
