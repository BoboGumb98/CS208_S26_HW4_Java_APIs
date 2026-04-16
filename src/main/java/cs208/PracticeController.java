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
        System.out.println("Parameters received in the body of the GET request:");
        System.out.println("first_name      = " + firstName);
        System.out.println("last_name      = " + lastName);
        System.out.println("PracticeControler.displayName - END");
        return "The name provided is: " + firstName + " " + lastName;
    }


    // TODO: create a GET route with a path parameter
    // http://localhost:8080/user/brolengumb/profile
    //GET /user/BSUUsername/profile
    @GetMapping ("/user/{BSUUsername}/profile")
    public String user(
            @PathVariable(name = "BSUUsername") String userName)
    {
        System.out.println("PracticeControler.user - START");
        System.out.println("Parameters received in the body of the GET request:");
        System.out.println("BSUUsername     = " + userName);
        System.out.println("PracticeControler.user - END");

        return "The username provided is: " + userName;
    }

    // TODO: create a POST route with two form parameters
    // http://localhost:8080/create_user
    // POST /create_user
    @PostMapping ("/create_user")
    public String createUser(
            @RequestParam(name = "first_name") String firstName,
            @RequestParam(name = "last_name") String lastName)
    {
        System.out.println("PracticeControler.create_user - START");
        System.out.println("Parameters received in the body of the POST request:");
        System.out.println("first_name     = " + firstName);
        System.out.println("last_name     = " + lastName);
        System.out.println("PracticeControler.create_user - END");

        return "The username provided is: " + firstName + " " + lastName;
    }

    // TODO: create a PATCH route
    // http://localhost:8080/user/brolengumb/update_profile
    // PATCH /user/{BSUUsername}/update_profile
    @PatchMapping("/user/{BSUUsername}/update_profile")
    public String update_profile(
            @PathVariable(name = "BSUUsername") String userName,
            @RequestParam(name = "theme") String theme,
            @RequestParam(name = "language-code") String lang)
    {
        System.out.println("PracticeControler.update_profile - START");
        System.out.println("Path variable received: " + userName);
        System.out.println("Form parameter 'theme' received: " + theme);
        System.out.println("Form parameter 'language-code' received: " + lang);
        System.out.println("PracticeControler.update_profile - END");

        return "Updated " + userName + "'s profile. Theme: " + theme + ", Language: " + lang;
    }

    // TODO: create a DELETE route
    // http://localhost:8080/resource/{resourceId}
    // DELETE /resource/{resourceId}
    @DeleteMapping("/resource/{resourceId}")
    public String DeleteResourceId (
            @PathVariable(name = "resourceId") String id,
            @RequestParam(name = "authentication_token") String auth_token)

    {
        System.out.println("PracticeControler.resource - START");
        System.out.println("ResourceId variable received: " + id);
        System.out.println("Authentication_token variable received: " + auth_token);
        System.out.println("PracticeControler.resource - END");

        return "Student: " + id + " was deleted with authentication_token: " + auth_token;
    }

    // TODO: create a GET API that returns a random resource

}
