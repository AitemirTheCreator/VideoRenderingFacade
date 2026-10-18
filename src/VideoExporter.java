package videorender;

public class VideoExporter {
    public void exportVideo(String video, String outputPath) {
        if (outputPath == null || outputPath.isBlank()) {
            throw new IllegalArgumentException("Invalid output path");
        }

        System.out.println("Exporting to: " + outputPath);
        System.out.println("Video data: " + video);
        System.out.println("Export completed!");
    }
}
