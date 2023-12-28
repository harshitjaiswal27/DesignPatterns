package structural_patterns.adapter_pattern.old_ui;

import structural_patterns.adapter_pattern.data.XmlData;

public class RestaurantApp implements IRestaurantApp{
    @Override
    public void displayMenus(XmlData xmlData) {
        System.out.println("Displaying the restaurant menu!");
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        System.out.println("Displaying the recommendations!");
    }
}
