import java.math.BigDecimal;
// Look at: Package and class name, Constructor summary, Method Summary

class Main {
  public static void main(String[] args) {
    // see READ_ME for instructions
    BigDecimal bigd = new BigDecimal(200);
    // yes, the BigDecimal constructor is overloaded
    String bigString = bigd.toEngineeringString();
    BigDecimal scaled = bigd.setScale(2); 
    long veryLong = 21_000_000_000L;
    BigDecimal bigLong = BigDecimal.valueOf(veryLong);
  }
}