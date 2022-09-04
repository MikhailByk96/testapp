package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class SensorsController {
    @Autowired private SensorsService service;

    @GetMapping("/sensors")
    public String showSensorsList(Model model){
        List<Sensors> list = service.listAll();
        model.addAttribute("listSensors", list);

        return "sensors";
    }

    @GetMapping("/sensors/new")
    public String showNewForm(Model model)
    {
        model.addAttribute("sensor", new Sensors());
        model.addAttribute("pageTitle", "Add new Sensor");
        return "sensors_new";
    }

    @PostMapping("sensors/save")
    public String saveSensor(Sensors sensor, RedirectAttributes ra)
    {
        service.save(sensor);
        ra.addAttribute("message","Sensors has been added");
        if(sensor.getRangeFrom() < sensor.getRangeTo())
        {
            return "alert('Error')";
        }
        else return "redirect:/sensors";
    }

    @GetMapping("/sensors/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model, RedirectAttributes ra) throws Exception {
            Sensors sensor = service.get(id);
            model.addAttribute("sensor", sensor);
            model.addAttribute("pageTitle", "Edit sensor (ID = "+id+")");
            return "sensors_new";
    }

    @GetMapping("/sensors/delete/{id}")
    public String deleteSensor(@PathVariable("id") Integer id, Model model, RedirectAttributes ra) throws Exception {
        service.delete(id);

        return "redirect:/sensors";
    }
}

