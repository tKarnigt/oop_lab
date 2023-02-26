public class Stock
{
    public String symbol,name;
    public double previousClosingPrice, currentPrice, ChangePercent;
    public Stock(String newSymbol, String newName, double PPrice, double CPrice){
        name = newName;
        symbol = newSymbol;
        previousClosingPrice = PPrice;
        currentPrice = CPrice;
        ChangePercent = ((currentPrice - previousClosingPrice)/previousClosingPrice)*100;
    }
}
