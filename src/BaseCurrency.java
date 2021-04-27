public interface BaseCurrency
{
    double DEFAULT_USD = 1;
    double DEFAULT_EURO = 1;
    double DEFAULT_YUAN = 1;
    double DEFAULT_GBP = 1;

    void setUSD(double i);
    void setEURO(double i);
    void setYUAN(double i);
    void setGBP(double i);

    double getUSD();
    double getEURO();
    double getYUAN();
    double getGBP();
}
