package com.example.demo.controller;

import com.example.demo.model.Amount;
import com.example.demo.model.BankAccountInfo;
import com.example.demo.service.IBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BankController {

    @Autowired
    private IBankService bankService;

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("amount", new Amount());
        return "create";
    }

    @PostMapping("/create")
    public ModelAndView saveBlog(@ModelAttribute("amount") Amount amount) {
        BankAccountInfo from = bankService.findById(amount.getId()).get();
        BankAccountInfo to = bankService.findById(amount.getId2()).get();
        ModelAndView modelAndView = new ModelAndView();
        if(from != null && to != null){
            from.setBalance(from.getBalance() - amount.getAmount());
            to.setBalance(to.getBalance() + amount.getAmount());
            bankService.save(bankService.save(from));
            bankService.save(bankService.save(to));
            modelAndView = new ModelAndView("/create");
            modelAndView.addObject("message", "New transaction successfully");
        } else{
            modelAndView = new ModelAndView("/create");
            modelAndView.addObject("message", "Id user does not exist");
        }

        return modelAndView;
    }

    @GetMapping("/banks")
    public String listBlogs(Model model) {
        model.addAttribute("banks", bankService.findAll());
        return "list";
    }

}
