package com.covid.covid_tracker.controllers;


import com.covid.covid_tracker.models.LocationStats;
import com.covid.covid_tracker.services.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.processing.Generated;
import javax.xml.stream.Location;
import java.util.List;

@Controller
public class CoronaController {

    @Autowired
    CovidDataService covidDataService;

    @GetMapping("/")
    public String covid(Model model){
        List<LocationStats> allstats = covidDataService.getAllStats();
        int total_cases = allstats.stream().mapToInt(stat -> stat.getLatest_total_cases()).sum();
        int total_previous_cases = allstats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
        model.addAttribute("locationStats", allstats);
        model.addAttribute("totalReportedCases", total_cases);
        model.addAttribute("previousDayCases", total_previous_cases);
        return "covid";
    }

}
