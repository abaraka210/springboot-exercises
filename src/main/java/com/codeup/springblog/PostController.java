package com.codeup.springblog;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * should return strings for the following routes that describe what will ultimately be there.
 *
 * method 	url	             description
 *
 * GET	   /posts	         posts index page
 * GET	   /posts/{id}	     view an individual post
 * GET	   /posts/create	 view the form for creating a post
 * POST	   /posts/create	 create a new post*/
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String index(){
        return "List of posts...";
    }
    @GetMapping("/posts/{id}")
    @ResponseBody
    public String show(@PathVariable long id){
        return "Displaying post: " + id;
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String create(){
        return "Displaying create post";
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public void insert(){
    }
}
