package ex3;

public class Article {
    public int articleCode;
    public String description;
    double random = Math.random();
    private double price;
    private double availability;

    public Article(int articleCode, String description) {
        this.price = random;
        this.availability = random;
    }

    public void printInfoArticle() {
        System.out.println("article code: " + this.articleCode + " description " + this.description + " price " + this.price + " availability " + this.availability);
    }
}
