package BankSOLID;

public class App {

    public static void main(String[] args) {
        Client client = new Client("Carlos", "123456");
        Account account = new Account("Carlos", "123456");
        Bank bank = new Bank(client, account);

    }

}
