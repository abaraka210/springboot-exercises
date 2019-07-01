package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Create a page at /roll-dice that asks the user to guess a number.
 * There should be links on this page for 1 through 6 that should
 * make a get request to /roll-dice/n where n is the number guessed.
 * */
@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    public String rollPage() {
        return "dice/dice-roll";
    }

    @GetMapping("/roll-dice/{guess}")
    public String guessPage(@PathVariable int guess, Model model) { /**Model to pass data to view*/
        int rand = getRandInt();
        model.addAttribute("roll", rand)
                .addAttribute("guess", guess)
                .addAttribute("result", rand == guess);
        return "dice/dice-results"; /**Since using thymeleaf, returning this to a file with thisname.html inside of  the resources/templates directory. */

    }

    public int getRandInt() {
        double randomDouble = Math.random();
        randomDouble = randomDouble * 6 + 1;
        int randomInt = (int) randomDouble;
        return randomInt;
    }

}