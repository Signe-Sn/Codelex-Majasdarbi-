package polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        List<Sound> soundList = new ArrayList<>();
        Firework firework = new Firework();
        Radio radio = new Radio();
        Radio swh = new Radio();
        Parrot parrot = new Parrot();
        Parrot piratesParrot = new Parrot();

        soundList.add(firework);
        soundList.add(piratesParrot);
        soundList.add(radio);
        soundList.add(parrot);
        soundList.add(swh);

        for (Sound sound : soundList) {
            sound.playSound();
        }
    }
}
