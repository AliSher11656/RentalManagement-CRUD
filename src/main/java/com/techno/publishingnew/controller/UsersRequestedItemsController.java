package com.techno.publishingnew.controller;

import com.techno.publishingnew.bean.UsersRequestedItems;
import com.techno.publishingnew.service.ItemsService;
import com.techno.publishingnew.service.UsersRequestedItemsService;
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
public class UsersRequestedItemsController {
    @Autowired
    private UsersRequestedItemsService usersRequestedItemsService;
//    @Autowired
//    private TournamentsService tournamentsService;
//    @Autowired
//    private EventTypesService eventTypesService;
@Autowired
private UsersService usersService;
    @Autowired
    private ItemsService itemsService;


    @RequestMapping(value = "/saveUsersRequestedItems", method = RequestMethod.POST)
    public ModelAndView saveUsersRequestedItems(@ModelAttribute("command") UsersRequestedItems usersRequestedItems)
    {
        usersRequestedItemsService.addUsersRequestedItems(usersRequestedItems);
        return new ModelAndView("redirect:/addUsersRequestedItems.html");
    }
    @RequestMapping(value = "/addUsersRequestedItems", method = RequestMethod.GET)
    public ModelAndView addUsersRequestedItems(@ModelAttribute("command") UsersRequestedItems usersRequestedItems)
    {
        Map<String, Object> model = new HashMap<>();
        model.put("usersRequestedItemss", usersRequestedItemsService.getUsersRequestedItemss());
        model.put("userss", usersService.getUserss());
        model.put("itemss", itemsService.getItemss());


        return new ModelAndView("addUsersRequestedItems", model);
    }
    @RequestMapping(value = "/deleteUsersRequestedItems", method = RequestMethod.GET)
    public ModelAndView deleteUsersRequestedItems(@ModelAttribute("command") UsersRequestedItems usersRequestedItems)
    {
        usersRequestedItemsService.deleteUsersRequestedItems(usersRequestedItems.getId());
        Map<String, Object> model = new HashMap<>();
        model.put("usersRequestedItemss", usersRequestedItemsService.getUsersRequestedItemss());
        model.put("userss", usersService.getUserss());
        model.put("itemss", itemsService.getItemss());
        return new ModelAndView("addUsersRequestedItems", model);
    }
    @RequestMapping(value = "/editUsersRequestedItems", method = RequestMethod.GET)
    public ModelAndView editUsersRequestedItems(@ModelAttribute("command") UsersRequestedItems usersRequestedItems)
    {
        Map<String, Object> model = new HashMap<>();
        model.put("usersRequestedItems", usersRequestedItemsService.getUsersRequestedItems(usersRequestedItems.getId()));
        model.put("usersRequestedItemss", usersRequestedItemsService.getUsersRequestedItemss());
        model.put("userss", usersService.getUserss());
        model.put("itemss", itemsService.getItemss());
        return new ModelAndView("addUsersRequestedItems", model);
    }

    @RequestMapping(value = "/usersRequestedItemss", method = RequestMethod.GET)
    public List<UsersRequestedItems> getUsersRequestedItemss()
    {
        return usersRequestedItemsService.getUsersRequestedItemss();
    }
}
