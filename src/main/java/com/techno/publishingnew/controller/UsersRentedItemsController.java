package com.techno.publishingnew.controller;

import com.techno.publishingnew.bean.UsersRentedItems;
import com.techno.publishingnew.service.*;
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
public class UsersRentedItemsController {
    @Autowired
    private UsersRentedItemsService usersRentedItemsService;
//    @Autowired
//    private TournamentsService tournamentsService;
//    @Autowired
//    private EventTypesService eventTypesService;
@Autowired
private UsersService usersService;
    @Autowired
    private ItemsService itemsService;


    @RequestMapping(value = "/saveUsersRentedItems", method = RequestMethod.POST)
    public ModelAndView saveUsersRentedItems(@ModelAttribute("command") UsersRentedItems usersRentedItems)
    {
        usersRentedItemsService.addUsersRentedItems(usersRentedItems);
        return new ModelAndView("redirect:/addUsersRentedItems.html");
    }
    @RequestMapping(value = "/addUsersRentedItems", method = RequestMethod.GET)
    public ModelAndView addUsersRentedItems(@ModelAttribute("command") UsersRentedItems usersRentedItems)
    {
        Map<String, Object> model = new HashMap<>();
        model.put("usersRentedItemss", usersRentedItemsService.getUsersRentedItemss());
        model.put("userss", usersService.getUserss());
        model.put("itemss", itemsService.getItemss());


        return new ModelAndView("addUsersRentedItems", model);
    }
    @RequestMapping(value = "/deleteUsersRentedItems", method = RequestMethod.GET)
    public ModelAndView deleteUsersRentedItems(@ModelAttribute("command") UsersRentedItems usersRentedItems)
    {
        usersRentedItemsService.deleteUsersRentedItems(usersRentedItems.getId());
        Map<String, Object> model = new HashMap<>();
        model.put("usersRentedItemss", usersRentedItemsService.getUsersRentedItemss());
        model.put("userss", usersService.getUserss());
        model.put("itemss", itemsService.getItemss());
        return new ModelAndView("addUsersRentedItems", model);
    }
    @RequestMapping(value = "/editUsersRentedItems", method = RequestMethod.GET)
    public ModelAndView editUsersRentedItems(@ModelAttribute("command") UsersRentedItems usersRentedItems)
    {
        Map<String, Object> model = new HashMap<>();
        model.put("usersRentedItems", usersRentedItemsService.getUsersRentedItems(usersRentedItems.getId()));
        model.put("usersRentedItemss", usersRentedItemsService.getUsersRentedItemss());
        model.put("userss", usersService.getUserss());
        model.put("itemss", itemsService.getItemss());
        return new ModelAndView("addUsersRentedItems", model);
    }

    @RequestMapping(value = "/usersRentedItemss", method = RequestMethod.GET)
    public List<UsersRentedItems> getUsersRentedItemss()
    {
        return usersRentedItemsService.getUsersRentedItemss();
    }
}
