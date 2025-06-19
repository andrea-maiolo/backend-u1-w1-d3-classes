package ex3;

import java.util.Random;

public class Article {
    Random random = new Random();
    private int articleCode;
    private String description;
    private double price;
    private double availability;

    public Article(double price, String description) {
        this.articleCode = random.nextInt(100, 300);
        this.description = description;
        this.price = price;
        this.availability = random.nextInt(1, 10);
    }

    public Article(Article a) {
        this.availability = random.nextInt(1, 10);
        this.price = a.price;
        this.articleCode = random.nextInt(100, 300);
        this.description = a.description;
    }

    public void printInfoArticle() {
        System.out.println("article code: " + this.articleCode + " description " + this.description + " price " + this.price + " availability " + this.availability);
    }

    public double getPrice() {
        return this.price;
    }
}
