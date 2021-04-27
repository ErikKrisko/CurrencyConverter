import java.util.Scanner;

public class testClass
{
    public static void main(String[] args)
    {
        convertCurrencies();
    }

    private static void convertCurrencies()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter EURO: ");
        String euS = sc.next();
        double eu = Double.parseDouble(euS);
        MultiCurrencyConverter usd = new MultiCurrencyConverter();

        System.out.println("EURO: "+eu+" USD: "+usd.toUSD(eu)+" YUAN: "+usd.toYUAN(eu)+" GBP: "+usd.toGBP(eu));
    }
}
