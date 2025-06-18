package ex2;

public class Calls {
    private String phoneNumber;
    private int duration; // in seconds

    public Calls(String phoneNumber, int duration) {
        this.phoneNumber = phoneNumber;
        this.duration = duration;
    }


    @Override
    public String toString() {
        return "Call to " + phoneNumber + " lasting " + duration;
    }
}

