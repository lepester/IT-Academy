package adept.band;

public class LeadGuitar extends  Human implements BandActions {
    @Override
    public void setMembersAmount() {
        System.out.println(MEMBERS_AMOUNT);
    }

    @Override
    public void sayMyName() {
        System.out.println("My name is Thomas. My guitar is tuned. I'm ready to give you some energy.");
    }

    @Override
    public void play() {
        System.out.println("~Lead Guitar sounds~");
    }

    public void play(String withVocals) {
        System.out.println("I will support you with " + withVocals + "\n");
    }

    public int getHairLength() {
        return 8;
    }
}

