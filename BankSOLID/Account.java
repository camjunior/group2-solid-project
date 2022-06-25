package BankSOLID;

class Account extends Client {
    double bal;
    double prevTrans;

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public double getPrevTrans() {
        return prevTrans;
    }

    public void setPrevTrans(double prevTrans) {
        this.prevTrans = prevTrans;
    }

    Account(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    void deposit(double amount) {
        if (amount != 0) {
            bal += amount;
            prevTrans = amount;
        }
    }

    void withdraw(double amt) {
        if (amt != 0 && bal >= amt) {
            bal -= amt;
            prevTrans = -amt;
        } else if (bal < amt) {
            System.out.println("Bank balance insufficient");
        }
    }

    void getPreviousTrans() {
        if (prevTrans > 0) {
            System.out.println("Deposited: " + prevTrans);
        } else if (prevTrans < 0) {
            System.out.println("Withdrawn: " + Math.abs(prevTrans));
        } else {
            System.out.println("No transaction occured");
        }
    }
}