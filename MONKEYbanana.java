import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
    {
        Scanner np= new Scanner(System.in);
        int n = np.nextInt();
        int k = np.nextInt();
        int j = np.nextInt();
        int m = np.nextInt();
        int p = np.nextInt();
        if(n < 0 || k <= 0 || j <= 0 || m < 0 || p < 0)
        {
            System.out.println("wrong input");
        }
        else
        {
            int bananaMonkeys = m / k;
            int peanutMonkeys = p / j;
            int totalAte = bananaMonkeys + peanutMonkeys;
            int remaining = n - totalAte;
            System.out.println("Totak no momkeys in tree:" + remaining);
        }
    }
}
