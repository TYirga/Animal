package tize.com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
            public String animal(){
        //private StringBuilder ss;
    Animal a = new Animal("The overloaded constructor has run");
        a.setName("Yogi Bear");

        System.out.println("The animal is called " + a.getName());
        System.out.println(a.eat());
        System.out.println(a.sleep());


    Animal b = new Animal();
        b.setName("Smokey the Bear");
        System.out.println("The animal is called " + b.getName());
        System.out.println(b.eat());
        System.out.println(b.sleep());
return a.getName();
}
}
