package ex2;

import java.util.Arrays;

public class Sim {
    private Calls[] calls = new Calls[5];
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
        if (numCalls >= 5) {
            for (int i = 0; i < this.calls.length; i++) {
                if (i == 4) {
                    this.calls[i] = call;
                } else {
                    this.calls[i] = calls[i + 1];
                }
            }
        } else {
            this.calls[numCalls] = call;
            this.numCalls++;
        }
    }

    public void printLastCalls() {
        System.out.println(Arrays.toString(this.calls));
    }
}
