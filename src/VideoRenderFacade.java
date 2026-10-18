package videorender;

public class VideoRenderFacade {
    private final VideoLoader loader = new VideoLoader();
    private final AudioProcessor audio = new AudioProcessor();
    private final EffectProcessor effects = new EffectProcessor();
    private final VideoEncoder encoder = new VideoEncoder();
    private final VideoExporter exporter = new VideoExporter();

    public void renderVideo(String fileName, String format,
                            String outputPath) {
        System.out.println("Starting video rendering...");

        String video = loader.loadVideo(fileName);
        video = audio.processAudio(video);
        video = effects.applyEffects(video);
        video = encoder.encode(video, format);
        exporter.exportVideo(video, outputPath);

        System.out.println("Rendering finished!");
    }
}
