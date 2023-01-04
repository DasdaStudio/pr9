public class Thread1 extends Thread{
    private Bank bank;

    public Thread1(Bank b){
        bank = b;
    }

    @Override
    public synchronized void run(){
      bank.inc();
    }
}