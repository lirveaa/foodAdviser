package clevoapps.studio.myapplication1;

import java.util.ArrayList;
import java.util.List;

public class FoodExpert {
    List<String> getDishes(String color){
        List<String> foodNames = new ArrayList<String>();
        switch (color) {
            case "Korean food":
                foodNames.add("Kimbap");
                foodNames.add("Bibimpab");
                foodNames.add("Ttokpokki");
                break;
            case "Japanese food":
                foodNames.add("Sushi");
                foodNames.add("Ramen");
                foodNames.add("Odong");
                break;
            case "Uzbek food":
                foodNames.add("Plov");
                foodNames.add("Manti");
                foodNames.add("Somsa");
                break;
            case "Turkish food":
                foodNames.add("Kebab");
                foodNames.add("Ayran");
                foodNames.add("Ankara shawarma");
                break;
        }
        return foodNames;
    }

}
