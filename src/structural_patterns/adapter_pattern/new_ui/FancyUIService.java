package structural_patterns.adapter_pattern.new_ui;

import structural_patterns.adapter_pattern.data.JsonData;
import structural_patterns.adapter_pattern.data.XmlData;

public class FancyUIService {
    public void displayMenus(JsonData jsonData){
        System.out.println("Displaying the restaurant menu in new format!");
    }
    public void displayRecommendations(JsonData jsonData) {
        System.out.println("Displaying the recommendations in new format!");
    }
}
