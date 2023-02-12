package sg.edu.nus.iss.Day1.Workshop.Controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Tell Spring boot that this is a controller
@Controller
//Requestmapping : Request to map to html 
@RequestMapping(path = {"/time", "/time.html"})
//need to create html file that is named time

public class TimeController {
    //GET info on time
    @GetMapping
    //create a class that gets the time by adding attribute to the model
    public String getTime (Model model){
        Date date = new Date(); 
        //converts class to string
        String currentTime = date.toString();

        //prints out in html 
        System.out.printf("The time now is %s\n", currentTime);

        //add to the model
        model.addAttribute("time", currentTime);

        //return view on html 
        return "time"; 

        //now create the html file to reflect this
    }
    
    
}
