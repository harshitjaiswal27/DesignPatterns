package structural_patterns.adapter_pattern.old_ui;

import structural_patterns.adapter_pattern.data.XmlData;

public interface IRestaurantApp {
    void displayMenus(XmlData xmlData);
    void displayRecommendations(XmlData xmlData);
}
