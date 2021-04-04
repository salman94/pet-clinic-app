package cool.programmer.petclinicapp.controllers;

import cool.programmer.petclinicapp.services.VetService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

    private final VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"", "/", "/index", "/index.html"})
    public String listVets(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
