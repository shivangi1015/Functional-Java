package adapter;

public class adapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("vlc", "file1");
        audioPlayer.play("mp3", "file1");
        audioPlayer.play("mp4", "file1");
        audioPlayer.play("avi", "file1");
    }
}
