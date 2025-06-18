import ex1.Rectangle;
import ex2.Sim;
import ex3.Article;

public class Main {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5.7, 6.1);
        //myRectangle.printRectangle();

        Rectangle secondR = new Rectangle(2.7, 7.8);

//        Rectangle.printTwoRectangles(myRectangle, secondR);
        Sim mySim = new Sim("3664537890");

//        mySim.setCredit(5);
//        mySim.printInfo();
//        mySim.makeCall("4848", 56);
//        mySim.makeCall("4848", 56);
//        mySim.makeCall("4848", 56);
//        mySim.makeCall("4848", 56);
//        mySim.makeCall("4848", 56);
//        mySim.printLastCalls();

        Article myArticle = new Article(34, "shoes");

        myArticle.printInfoArticle();
    }


}