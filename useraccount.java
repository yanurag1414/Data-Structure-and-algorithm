public class useraccount {
    public static void main(String[] args) {
        account myaccount = new account();
        account youraccount = new account();
        
        myaccount.balance=5467;
        youraccount.balance=45748;
        youraccount.name="rekha";
        System.out.println(myaccount.name);
        System.out.println(youraccount.balance);



    }
    public static class account{
        String name="Anurag";
        double balance;
    }

}
