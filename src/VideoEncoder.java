package videorender;

public class VideoEncoder {
    public String encode(String video, String format) {
        if (!format.equalsIgnoreCase("mp4")
                && !format.equalsIgnoreCase("avi")) {
            throw new IllegalArgumentException("Unsupported format");
        }

        System.out.println("Encoding video to " + format);
        return video + " [encoded as " + format + "]";
    }
}
