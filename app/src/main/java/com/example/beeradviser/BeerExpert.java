package com.example.beeradviser;
import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String spinner){
        List<String> proyectos = new ArrayList<>();
        if (spinner.equals("Light")){
            proyectos.add("Microbrasserie Le Bockale");
            proyectos.add("Athletic Brewing Co");
            proyectos.add("Karlsberg Grapefruit");
        } else if (spinner.equals("Amber")) {
            proyectos.add("Piraat Rum Barrel Aged");
            proyectos.add("Samichlaus");
        }else if (spinner.equals("Brown")) {
            proyectos.add("E. Brown Ale");
            proyectos.add("St. Bernardus Abt 12");
        }else if (spinner.equals("Dark")) {
            proyectos.add("Gulden Draak Russian Imperial Sout");
            proyectos.add("Rochefort 10");
        }
        return proyectos;
    }
}