package ex3;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Client {
    private int codiceCliente;
    private String name;
    private String surname;
    private String email;
    private String dataIscrizione;


    public Client(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        Date now = new Date();  // current date and time
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        this.dataIscrizione = formatter.format(now);
        Random random = new Random();
        this.codiceCliente = random.nextInt(1, 50);
    }

    public int getCodiceCliente() {
        return this.codiceCliente;
    }
}
