package videorender;

public class Main {
    public static void main(String[] args) {
        VideoRenderFacade facade = new VideoRenderFacade();

        facade.renderVideo(
                "myVideo.mov",
                "mp4",
                "output/finalVideo.mp4"
        );
    }
}
