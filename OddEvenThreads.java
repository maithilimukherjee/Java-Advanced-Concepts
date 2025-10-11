class OddThread extends Thread
{
    public void run()
    {
        for(int i = 1; i < 20; i = i + 2)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

class EvenThread extends Thread
{
    public void run()
    {
        for(int i = 2; i <= 20; i = i + 2)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

class OddEvenThreads
{
    public static void main(String[] args)
    {
        OddThread t1 = new OddThread();
        EvenThread t2 = new EvenThread();
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
