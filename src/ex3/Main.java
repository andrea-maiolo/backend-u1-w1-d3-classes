package ex3;

public class Main {
    public static void main(String[] args) {
        Article shoes = new Article(30.59, "running shoes");
        Article shoes2 = new Article(59.99, "running shoes");
        Article shoes3 = new Article(16.00, "running shoes");
        Article shoes4 = new Article(100.67, "running shoes");
        Article shoes5 = new Article(43.89, "running shoes");
        Article shoes6 = new Article(21.75, "running shoes");
        Article shoes7 = new Article(24.67, "running shoes");

        Client a = new Client("paperino", "x", "paperino@gmail.com");
        Client b = new Client("topolino", "x", "topolino@gmail.com");


        Cart carrelloA = new Cart(a);
        carrelloA.aggiungiACarrello(shoes5);
        carrelloA.aggiungiACarrello(shoes3);
        carrelloA.aggiungiACarrello(shoes6);
        carrelloA.printInfo();
        carrelloA.totaleCarello();
    }
}
