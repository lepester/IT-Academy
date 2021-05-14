package adept.band;

public class Main extends Human {

    @Override
    public int getHairLength() {
        return 0;
    }

    public static void main(String[] args) {

        Vocals robert = new Vocals();
        robert.setMembersAmount();
        robert.sayMyName();
        hairLength(new Vocals());
        robert.play();
        robert.play("my guitar.");

        LeadGuitar tomas = new LeadGuitar();
        tomas.sayMyName();
        tomas.play();
        tomas.play("my vocals.");

        RhythmGuitar henry = new RhythmGuitar();
        henry.sayMyName();
        hairLength(new LeadGuitar());
        henry.play();
        henry.play("my scream.");
        hairLength(new RhythmGuitar());

        BassGuitar bobs = new BassGuitar();
        bobs.sayMyName();
        hairLength(new BassGuitar());
        bobs.play();
        bobs.play("my fantastic mood.");

        Drums harry = new Drums();
        harry.sayMyName();
        hairLength(new Drums());
        harry.play();
        harry.play("my vocal abilities.");
    }
}
