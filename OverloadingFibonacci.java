class OverloadingFibonacci
{
    static int x = 0 , y = 1 , z;
    static void calc(int n)
    {
        for ( int i = 1 ; i<=n ; i++)
        {
            System.out.println ( x + " ");
            z = x + y;
            x=y;
            y = z;
        }
        System.out.println();
    }
    
    static void calc (float l)
    {
        for ( int i = 1 ; i<=l ; i++)
        {
            System.out.print ( x + " ");
            z = x + y;
            x = y;
            y = z;
        }
        System.out.println();
    }
    public static void main (String [] args)
    {
        calc(5);
        calc(7);
    }
}