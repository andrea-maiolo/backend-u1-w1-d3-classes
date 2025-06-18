package ex2;

import java.util.Arrays;

public class Sim {
    public Calls[] calls;
    private String number;
    private int credit;

    public Sim(String cellNumber) {
        this.number = cellNumber;
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
