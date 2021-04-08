// [WARNING]: code will not compile!
import java.util.ArrayList;

public class Entree extends Food {
  private ArrayList<Side> sides;

  public Entree(String name, double price) {
    super(name, price);
    sides = new ArrayList<>();
  }

  public void addSide(Side side) {
    sides.add(side);
  }

  @Override
  public double getPrice() {
    double sidesPrice = 0;
    if(sides.size() > 2) {
      for(int i = 2; i < sides.size(); i++) {
        sidesPrice += sides.get(i).getPrice();
      }
    }
    if(getSpecial()) {
      return super.getPrice()*0.9 + sidesPrice;
    }
    return super.getPrice() + sidesPrice;
  }

  @Override
  public String toString() {
    if(sides.size() < 1) {
      return super.toString();
    }
    String sidesString = ", sides: ";
    for (Side side : sides) {
      sidesString += side.getName() + " ";
    }
    return super.toString() + sidesString;
  }
}

class Order {
  private ArrayList<Food> orderList;

  public Order(Food[] foods) { // yes, foods is the best plural of food
    orderList = new ArrayList<>();
    for (Food food : foods) {
      orders.add(food);
    }
  }

  public double getTotal() {
    double total = 0;
    for(Food food : orderList) {
      total += food.getPrice();
    }
    return total;
  }

  @Override
  public boolean equals(Order other) {
    if(other instanceof Order &&
        getTotal() == other.getTotal() &&
        orderList.size() == other.orderList.size()) 
    {
      return true;
    }
    return false;
  }
}