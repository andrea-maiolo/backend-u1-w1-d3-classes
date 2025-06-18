package ex2;

import java.util.Arrays;
import java.util.Random;

public class Sim {
    public Calls[] calls;
    private int number;
    private int credit;

    public Sim() {
        Random random = new Random();
        this.number = random.nextInt(10, 10000000);
        this.credit = 0;
        this.calls = new Calls[5];
    }

    public void printInfo() {
        System.out.println("your number is " + this.number + " , and your credit is " + this.credit + "$");
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void makeCall(String phoneNumber, int duration) {
        Calls call = new Calls(phoneNumber, duration);

    }

    public void printLastCalls() {
        System.out.println(Arrays.toString(this.calls));
    }
}
