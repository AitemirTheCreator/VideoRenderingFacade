package videorender;

public class VideoLoader {
    public String loadVideo(String fileName) {
        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("Invalid file name");
        }

        System.out.println("Loading video: " + fileName);
        return fileName;
    }
}
