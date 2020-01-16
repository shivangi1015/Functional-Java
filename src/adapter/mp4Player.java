package adapter;

public class mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //Do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Play mp4 file: " + fileName);
    }
}
