package behavioral_patterns.template_method_pattern;

public class NFSGameLoader extends BaseGameLoader{
    @Override
    void createObjects() {
        System.out.println("Creating NFS objects....");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading NFS files....");
    }

    @Override
    void initializeProfiles() {
        System.out.println("Initializing NFS profiles....");
    }
}
