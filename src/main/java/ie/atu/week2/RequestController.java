package ie.atu.week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {
    @GetMapping("/hello")
    public String hello() {

        return "hello";
}

// using a get request
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Hello " + name + "!";
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age) {
        return "Name " + name + ", Age " + age;
    }

    @GetMapping("/person")
    public Person getPerson(){
        return new Person("Stephen", 25);
    }

// ASSIGNMENT EXERCISe
// USED NULL FOR THE OPERATIONS AS ITS ONLY NEEDED FOR THE DIVIDE PART OF THE METHOD FOR THE DIVIDE BY ZERO ERROR

@GetMapping("/calculate")
    public calculator calculate( @RequestParam double num1, @RequestParam double num2, @RequestParam String operation){
    if (operation.equalsIgnoreCase("add")) {
        return new calculator("add", num1 + num2, null);

    }
    else if (operation.equalsIgnoreCase("subtract")) {
        return new calculator("subtract", num1 - num2, null);
    }
    else if (operation.equalsIgnoreCase("multiply")) {
        return new calculator("multiply", num1 * num2, null);
    }
    else if (operation.equalsIgnoreCase("divide")) {
        if (num2 == 0) {
            return new calculator("divide", null, "dividing by zero is not allowed");
        }
        return new calculator("divide", num1 / num2, null);
    }
    else {
        return new calculator(operation, null, "Invalid operation Use add, subtract, multiply, or divide.");
    }


}


}



