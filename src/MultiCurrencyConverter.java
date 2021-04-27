public class MultiCurrencyConverter extends CurrencyConverter
{
    private double usd,yuan,gbp;
    private final double usdRate = 1.21369, gbpRate = 0.880646, yuanRate = 7.82071;

    public MultiCurrencyConverter()
    {

    }

    public double usdToBase(double usd)
    {
        return usd / usdRate;
    }
    public double gbpToBase(double gbp)
    {
        return gbp / gbpRate;
    }
    public double yuanToBase(double yuan)
    {
        return yuan / yuanRate;
    }
    public double toUSD(double euro)
    {
        return usdRate * euro;
    }
    public double toGBP(double euro)
    {
        return gbpRate * euro;
    }
    public double toYUAN(double euro)
    {
        return yuanRate * euro;
    }

    @Override
    public void setUSD(double i) { usd = 1; }

    @Override
    public void setYUAN(double i) { yuan = 1;}

    @Override
    public void setGBP(double i) { gbp = 1;}

    @Override
    public double getUSD()
    {
        return usd;
    }

    @Override
    public double getYUAN() { return yuan; }

    @Override
    public double getGBP() { return gbp; }
}
