package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello";
    }

    @GetMapping("/goodbye")
    @ResponseBody
    public String goodbye(){
        return "goodbye";
    }

    //Path variables
    @GetMapping("/hello/{name}")
    @ResponseBody
    public String helloName(@PathVariable String name){
        return "howdy" + name;
    }


                //With numbers
    @GetMapping("/favNumber/{num=2}")
    @ResponseBody
    public String getFavNum(@PathVariable int num){
        return "Favorite number is:" + num;
    }

//    // Optional path variable
//    @RequestMapping(path = {"/favnum/{num}", "/favnum"},method = RequestMethod.GET)
//    @ResponseBody
//    public String getFavNum(@PathVariable(name = "num", required = false)) Optional<Integer> num{
//        return "Fav num is :" + num.orElse(3);
//    }
//
//
//    @RequestMapping(path="/increment/${number}", method = RequestMethod.GET)
//    @ResponseBody
//    public String addOne(@PathVariable int number){
//        return number + " plus 1 is " + (number + 1) ;
//    }
//
}
