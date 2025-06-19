import ex1.Rectangle;
import ex2.Sim;

public class Main {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5.7, 6.1);
        //myRectangle.printRectangle();
        Rectangle secondR = new Rectangle(2.7, 7.8);
        Rectangle basicR = new Rectangle();
        Rectangle.printTwoRectangles(myRectangle, secondR);
        basicR.printRectangle();


        Sim mySim = new Sim("3664537890");

        mySim.setCredit(5);
        mySim.printInfo();
        mySim.makeCall("4848", 56);
        mySim.makeCall("65346345", 126);
        mySim.makeCall("5454366", 5);
        mySim.makeCall("8904578903450789", 554);
        mySim.makeCall("344388", 583);
        mySim.makeCall("43545", 555);
        mySim.makeCall("nuova chiamate", 1);
        mySim.printLastCalls();


    }


}