package com.raunak.Covid19tracker.controllers;

import com.raunak.Covid19tracker.models.LocationStats;
import com.raunak.Covid19tracker.services.Covid19DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    Covid19DataService Covid19DataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = Covid19DataService.getAllStats();

        //creating a stream of values and getting the sum of all.
        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestCases()).sum();
        var totalNewCases = allStats.stream().mapToInt(stat -> stat.getNewCases()).sum();
        model.addAttribute("locationStats" , allStats);//set an attribute in the controller
        model.addAttribute("totalReportedCases" , totalReportedCases);
        model.addAttribute("totalNewCases" , totalNewCases);
        return "home";
    }
}
