package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/events")
public class EventsController {

    private static Map<String, String> events = new HashMap<String,String>();

    @GetMapping
    public String events(Model model){
        events.put("Name1","Description1");
        events.put("Name2","Description2");
        model.addAttribute("events", events);
        return "events/index";
    }

    /*@GetMapping("create")
    public String renderCreateEventForm(){
       return "events/create";
    }
*/
    /*@PostMapping("create")
    public String createEvent(@RequestParam String eventName){
         events.put(eventName);
         return "redirect:";
    }*/
}
