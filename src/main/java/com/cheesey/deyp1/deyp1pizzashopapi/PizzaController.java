package com.cheesey.deyp1.deyp1pizzashopapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {

    @RequestMapping("/pizzas")
    public String getString(){
        return "Pizzas are great.  They are awesome";
    }
}
