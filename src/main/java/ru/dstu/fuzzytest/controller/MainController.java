package ru.dstu.fuzzytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.dstu.fuzzytest.service.BuildingService;
import ru.dstu.fuzzytest.service.DistrictService;
import ru.dstu.fuzzytest.service.MunicipalityService;

@Controller
public class MainController {

    private final BuildingService buildingService;
    private final MunicipalityService municipalityService;
    private final DistrictService districtService;

    public MainController(BuildingService buildingService, MunicipalityService municipalityService, DistrictService distinctService) {
        this.buildingService = buildingService;
        this.municipalityService = municipalityService;
        this.districtService = distinctService;
    }

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/buildings")
    public String getAllBuilding(Model model){
        model.addAttribute("buildings", buildingService.getAll());
        return "buildingList";
    }

    @RequestMapping("/query1")
    public String execQuery1(Model model){
//        model.addAttribute("buildings", buildingService.getAll());
        return "buildingQuery1";
    }

    @RequestMapping("/municipalities")
    public String getAllMunicipality(Model model){
        model.addAttribute("municipalities", municipalityService.getAll());
        return "municipalityList";
    }

    @RequestMapping("/districts")
    public String getAllDistinct(Model model){
        model.addAttribute("districts", districtService.getAll());
        return "districtsList";
    }

}
