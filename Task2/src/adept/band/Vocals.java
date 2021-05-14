package adept.band;

public class Vocals extends Human implements BandActions {

    @Override
    public void setMembersAmount() {
        System.out.println("Our band has " + MEMBERS_AMOUNT + " members.");
    }

    @Override
    public void sayMyName() {
        System.out.println("My name is Robert. I am going to sing for you!!!");
    }

    @Override
    public void play() {
        System.out.println("Pizza mozzarella, pizza mozzarella, rella-rella-rella-rella");
    }

    public void play(String withGuitar) {
        System.out.println("And now I am going to sing with " + withGuitar + "\n");
    }

    public int getHairLength() {
        return 15;
    }

}
