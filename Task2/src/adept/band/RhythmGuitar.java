package adept.band;

public class RhythmGuitar extends Human implements BandActions {
    @Override
    public void setMembersAmount() {
        System.out.println(MEMBERS_AMOUNT);
    }

    @Override
    public void sayMyName() {
        System.out.println("My name is Henry. I want some beer, do ya have it?");
    }

    @Override
    public void play() {
        System.out.println("~Rhythm Guitar sounds~");
    }

    public void play(String withVocals) {
        System.out.println("I will support you too with " + withVocals + "\n");
    }

    public int getHairLength() {
        return 9;
    }
}

