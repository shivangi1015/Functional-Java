package adapter;

public class vlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Play vlc file name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //Do nothing
    }
}
