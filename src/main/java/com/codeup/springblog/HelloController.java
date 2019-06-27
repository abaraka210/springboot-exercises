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
        //with Strings
    @GetMapping("/hello/${name}")
    @ResponseBody
    public String helloName(@PathVariable String name){
        return "howdy" + name;
    }


                //With numbers
    @GetMapping("/favNumber/${num=2}")
    @ResponseBody
    public String getFavNum(@PathVariable int num){
        return "Favorite number is:" + num;
    }

    @RequestMapping(path="/increment/${number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number){
        return number + " plus 1 is " + (number + 1) ;
    }
    /*
    * Time to just write some randome stuff
    *
    * @GetMapping("/hello${name}")
    * @ResponseBody
    * public String helloName(@PathVariable String name){
    * return name + " is the best!";
    * }
    *
    *
    * //Creating a controller method with numbers
    *
    * @getMapping("/calculations")
    * @ResponseBody
    * public Double calculate(@PathVariable double num){

    * return (num%2=0)? num/num: num-num;
    * }
    * **/


}
