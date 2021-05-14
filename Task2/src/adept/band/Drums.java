package adept.band;

public class Drums extends Human implements BandActions {

    @Override
    public void setMembersAmount() {
        System.out.println(MEMBERS_AMOUNT);
    }

    @Override
    public void sayMyName() {
        System.out.println("My name is Harry. You're lucky because you can hear my awesome blast beats");
    }

    @Override
    public void play() {
        System.out.println("|| Drums sounds ||");
    }

    public void play(String withVocals) {
        System.out.println("I want to sing too with " + withVocals);
    }

    public int getHairLength() {
        return 1;
    }
}
