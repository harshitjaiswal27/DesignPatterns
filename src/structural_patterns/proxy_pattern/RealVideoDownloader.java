package structural_patterns.proxy_pattern;

public class RealVideoDownloader implements VideoDownloader{
    @Override
    public Video getVideo(String videoName) {
        System.out.println("Downloading video: "+videoName);
        System.out.println("Video Downloaded: "+videoName);
        return new Video(videoName);
    }
}
