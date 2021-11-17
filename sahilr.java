public class sahilr
{
    // private instance, so that it can be
    // accessed by only by getInstance() method
    private static sahilr instance;

    private sahilr()
    {
        // private constructor
    }

    public static sahilr getInstance()
    {
        if (instance == null)
        {
            //synchronized block to remove overhead
            synchronized (sahilr.class)
            {
                if(instance==null)
                {
                    // if instance is null, initialize
                    instance = new sahilr();
                }

            }
        }
        return instance;
    }
}
