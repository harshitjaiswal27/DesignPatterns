package structural_patterns.proxy_pattern;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader{
    private final VideoDownloader realVideoDownloader = new RealVideoDownloader();
    private final Map<String, Video> cache = new HashMap<>();
    @Override
    public Video getVideo(String videoName) {
        if(!cache.containsKey(videoName)){
            cache.put(videoName,realVideoDownloader.getVideo(videoName));
        }
        else{
            System.out.println("Served video from cache: "+videoName);
        }
        return cache.get(videoName);
    }
}
