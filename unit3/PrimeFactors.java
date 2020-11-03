class PrimeFactors {
  public static void main(String[] args) {
    String light = "YELLOW";
    boolean withinIntersection = false;
    if(light.equals("GREEN")){
      System.out.println("GO");
    }
    else if(light.equals("YELLOW")){
      System.out.println("SLOW DOWN");
      if(withinIntersection)
        System.out.println("PROCEED WITH CAUTION");
    else 
      System.out.println("STOP");
    }
  }
}