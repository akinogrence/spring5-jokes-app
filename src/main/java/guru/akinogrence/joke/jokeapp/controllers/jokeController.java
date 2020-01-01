package guru.akinogrence.joke.jokeapp.controllers;

import guru.akinogrence.joke.jokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jokeController {

    private JokeService jokeService;

    public jokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("jokeContent",jokeService.getJoke());

        return "chucknorris";
    }

}
