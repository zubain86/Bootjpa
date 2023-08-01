package com.example.bootjpa.controller;

import com.example.bootjpa.dao.AlienRepo;
import com.example.bootjpa.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {
    @Autowired
    AlienRepo repo;
    @RequestMapping("home")
    public String controller()
    {
        return "home";
    }
    @RequestMapping("/addAlien")
   public String addAlien(Alien alien)
   {
       repo.save(alien);
       return "home";
   }
   @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam("aid") int aid)
   {
       ModelAndView mv = new ModelAndView();
       Alien alien = repo.findById(aid).orElse(new Alien());
       mv.addObject(alien);
       mv.setViewName("show");
//       System.out.println(repo.findByAname("Zubain"));
//       System.out.println(repo.findByGreaterThan(1));
//       System.out.println(repo.findByAnameSorted("Zubain"));
       return mv;
   }
    @RequestMapping("/aliens")
    @ResponseBody
    public List<Alien> addAlien()
    {
       return repo.findAll();
    }
    @GetMapping("/alien/{aid}")

    public Optional<Alien> addAlien(@PathVariable("aid") int aid)
    {
        return repo.findById(aid);
    }
    @PostMapping("/alien")
    public Alien addsAlien(@RequestBody Alien alien)
    {
        repo.save(alien);
        return alien;
    }
    @PutMapping("/alien")
    public Alien saveOrUpdateAlien(@RequestBody Alien alien)
    {
        repo.save(alien);
        return alien;
    }
    @DeleteMapping("/alien/{aid}")
    public String delAlien(@PathVariable int aid)
    {
        Alien a = repo.getReferenceById(aid);
        repo.delete(a);
        return "deleted";
    }


}
