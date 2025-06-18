package ex2;

import java.util.Arrays;

public class Sim {
    public Calls[] calls = new Calls[5];
    private String number;
    private int credit;
    private int numCalls = 0;

    public Sim(String phoneNumber) {
        this.number = phoneNumber;
        this.credit = 0;
    }

    public void printInfo() {
        System.out.println("your number is " + this.number + " , and your credit is " + this.credit + "$");
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void makeCall(String phoneNumber, int duration) {
        Calls call = new Calls(phoneNumber, duration);
        if (numCalls == 5) {
            this.calls[0] = calls[1];
            this.calls[1] = calls[2];
            this.calls[2] = calls[3];
            this.calls[3] = calls[4];
            this.calls[4] = call;
        } else {
            this.calls[numCalls] = call;
            this.numCalls++;
        }
    }

    public void printLastCalls() {
        System.out.println(Arrays.toString(this.calls));
    }
}
