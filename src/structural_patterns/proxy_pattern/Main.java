package structural_patterns.proxy_pattern;

public class Main {
    public static void main(String[] args) {
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("Proxy Pattern");
        videoDownloader.getVideo("Proxy Pattern");
        videoDownloader.getVideo("Decorator Pattern");
    }
}
