package adept.band;

public class BassGuitar extends Human implements BandActions {
    @Override
    public void setMembersAmount() {
        System.out.println(MEMBERS_AMOUNT);
    }

    @Override
    public void sayMyName() {
        System.out.println("My name is Bobs. My guitar is tuned. I'm ready to give you some energy.");
    }

    @Override
    public void play() {
        System.out.println("~Bass Guitar sounds~");
    }

    public void play(String withMood) {
        System.out.println("I just give you my energy with " + withMood + "\n");
    }

    public int getHairLength() {
        return 22;
    }
}

