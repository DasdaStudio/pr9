public class Thread2 extends Thread{
    private Bank bank;

    public Thread2(Bank b){
        bank = b;
    }

    @Override
    public synchronized void run(){
        bank.dec();
    }
}