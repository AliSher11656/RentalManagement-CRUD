package com.techno.publishingnew.controller;

import com.techno.publishingnew.bean.Items;
import com.techno.publishingnew.service.ItemsService;
import com.techno.publishingnew.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

//    @Autowired
//    private TournamentTypesService tournamentTypesService;
    @Autowired
    private UsersService usersService;



    @RequestMapping(value = "/saveItems", method = RequestMethod.POST)
    public ModelAndView saveItems(@ModelAttribute("command") Items items)
    {
        itemsService.addItems(items);
        return new ModelAndView("redirect:/addItems.html");
    }
    @RequestMapping(value = "/addItems", method = RequestMethod.GET)
    public ModelAndView addItems(@ModelAttribute("command") Items items)
    {
        Map<String, Object> model = new HashMap<>();
        model.put("itemss", itemsService.getItemss());
        model.put("users", usersService.getUserss());

        return new ModelAndView("addItems", model);
    }
    @RequestMapping(value = "/deleteItems", method = RequestMethod.GET)
    public ModelAndView deleteItems(@ModelAttribute("command") Items items)
    {
        itemsService.deleteItems(items.getId());
        Map<String, Object> model = new HashMap<>();
        model.put("itemss", itemsService.getItemss());
        model.put("users", usersService.getUserss());
        return new ModelAndView("addItems", model);
    }
    @RequestMapping(value = "/editItems", method = RequestMethod.GET)
    public ModelAndView editItems(@ModelAttribute("command") Items items)
    {
        Map<String, Object> model = new HashMap<>();
        model.put("items", itemsService.getItems(items.getId()));
        model.put("itemss", itemsService.getItemss());
        model.put("users", usersService.getUserss());
        return new ModelAndView("addItems", model);
    }

    @RequestMapping(value = "/itemss", method = RequestMethod.GET)
    public List<Items> getItemss()
    {
        return itemsService.getItemss();
    }
}
