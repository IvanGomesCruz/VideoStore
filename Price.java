public abstract class Price {
   public abstract int getPriceCode();
   public double getCharge(int daysRented){
    double thisAmount = 0;
    thisAmount += getPriceCode();
    if (daysRented > getPriceCode())
      thisAmount += (daysRented - getPriceCode()) * 1.5;        
    return thisAmount;
  }
}