package ex3;

import java.util.Arrays;

public class Cart {
    private Client clienteAssociato;
    private Article[] articoliInCarrello;
    private double totaleCosto;
    private int indexArrayArticoli = 0;

    public Cart(Client c) {
        this.clienteAssociato = c;
        this.totaleCosto = 0.00;
        this.articoliInCarrello = new Article[3];
    }

    public void aggiungiACarrello(Article a) {
        Article articleToAdd = new Article(a);
        articoliInCarrello[indexArrayArticoli] = articleToAdd;
        indexArrayArticoli++;
    }

    public void totaleCarello() {
        for (int i = 0; i < articoliInCarrello.length; i++) {
            totaleCosto += articoliInCarrello[i].getPrice();
        }
        System.out.println(totaleCosto);
    }

    public void printInfo() {
        System.out.println(Arrays.toString(this.articoliInCarrello));
        System.out.println(this.totaleCosto);
        System.out.println(this.clienteAssociato.getCodiceCliente());
    }
}
