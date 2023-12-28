package structural_patterns.adapter_pattern;

import structural_patterns.adapter_pattern.data.JsonData;
import structural_patterns.adapter_pattern.data.XmlData;
import structural_patterns.adapter_pattern.new_ui.FancyUIService;
import structural_patterns.adapter_pattern.old_ui.IRestaurantApp;

public class FancyUIServiceAdapter implements IRestaurantApp {
    private final FancyUIService fancyUIService= new FancyUIService();
    public void displayMenus(XmlData xmlData){
        JsonData jsonData = convertToJson(xmlData);
        fancyUIService.displayMenus(jsonData);
    }

    public void displayRecommendations(XmlData xmlData){
        JsonData jsonData = convertToJson(xmlData);
        fancyUIService.displayRecommendations(jsonData);
    }

    private JsonData convertToJson(XmlData xmlData){
        //logic to convert Xml to Json
        return new JsonData();
    }
}
