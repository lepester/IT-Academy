package adept.band;

public interface BandActions {
    int MEMBERS_AMOUNT = 5;

    void setMembersAmount();
    void play();

    default void sayMyName() {
        System.out.println("Heeeey, punks! We are ADEPT and we're going to sing for you!");
    }
}

