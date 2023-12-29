package behavioral_patterns.template_method_pattern;

public class GTAGameLoader extends BaseGameLoader{
    @Override
    void createObjects() {
        System.out.println("Creating GTA objects....");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading GTA files....");
    }

    @Override
    void initializeProfiles() {
        System.out.println("Initializing GTA profiles....");
    }
}
