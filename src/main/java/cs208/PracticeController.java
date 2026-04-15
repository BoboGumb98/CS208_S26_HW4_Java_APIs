package cs208;

import org.springframework.web.bind.annotation.*;

@RestController
public class PracticeController
{
    // TODO: create a GET route with two query parameters
    // http://localhost:8080/display_name?first_name=Brolen&last_name=Gumb
    // GET /display_name?firstName=value1&lastName=value2
    @GetMapping ("/display_name")
    public String displayName(
            @RequestParam(name = "first_name") String firstName,
            @RequestParam(name = "last_name") String lastName)
    {
        System.out.println("PracticeControler.displayName - START");
        System.out.println("Parameters recieved in the body of the GET request:");
        System.out.println("first_name      = " + firstName);
        System.out.println("last_name      = " + lastName);
        System.out.println("PracticeControler.displayName - END");
        return "The name provided is: " + firstName + " " + lastName;
    }


    // TODO: create a GET route with a path parameter


    // TODO: create a POST route with two form parameters


    // TODO: create a PATCH route


    // TODO: create a DELETE route


    // TODO: create a GET API that returns a random resource

}
