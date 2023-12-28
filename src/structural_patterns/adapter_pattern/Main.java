package structural_patterns.adapter_pattern;

import structural_patterns.adapter_pattern.data.XmlData;
import structural_patterns.adapter_pattern.new_ui.FancyUIService;
import structural_patterns.adapter_pattern.old_ui.IRestaurantApp;
import structural_patterns.adapter_pattern.old_ui.RestaurantApp;

public class Main {
    public static void main(String[] args) {
        //Old UI implementations
        IRestaurantApp restaurantApp = new RestaurantApp();
        restaurantApp.displayMenus(new XmlData());
        restaurantApp.displayRecommendations(new XmlData());

        //new UI implementation with adapter
        FancyUIServiceAdapter fancyUIServiceAdapter = new FancyUIServiceAdapter();
        fancyUIServiceAdapter.displayMenus(new XmlData());
        fancyUIServiceAdapter.displayRecommendations(new XmlData());
    }
}
