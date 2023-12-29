package behavioral_patterns.template_method_pattern;

public abstract class BaseGameLoader {
    void load(){
        System.out.println("Loading Game.....");
        cleanTemporaryFiles();
        createObjects();
        downloadAdditionalFiles();
        initializeProfiles();
        System.out.println("Game Loaded Successfully....");
    }
    abstract void createObjects();
    abstract void downloadAdditionalFiles();
    abstract void initializeProfiles();
    protected void cleanTemporaryFiles(){
        System.out.println("Cleaning temporary files!");
    }
}
