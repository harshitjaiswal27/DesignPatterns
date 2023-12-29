package behavioral_patterns.template_method_pattern;

public class Games {
    public static void main(String[] args) {
        BaseGameLoader gtaLoader = new GTAGameLoader();
        gtaLoader.load();
        System.out.println("======================================");
        BaseGameLoader nfsLoader = new NFSGameLoader();
        nfsLoader.load();
    }
}
