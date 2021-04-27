public class CurrencyConverter implements BaseCurrency
{
    private double usd;

    public CurrencyConverter() { usd = DEFAULT_USD; }

    public CurrencyConverter(double euro) { usd = 1.21369 * euro; }

    @Override
    public void setUSD(double i) { usd = 1;}

    @Override
    public void setEURO(double i) { }

    @Override
    public void setYUAN(double i) { }

    @Override
    public void setGBP(double i) { }

    @Override
    public double getUSD() { return usd; }

    @Override
    public double getEURO() {
        return 0;
    }

    @Override
    public double getYUAN() {
        return 0;
    }

    @Override
    public double getGBP() {
        return 0;
    }
}

