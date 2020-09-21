public class DietSession { 

  public void startDiet(String command) {
    switch(command) {
    case add:
      addFood();
      break;
    case list:
      listFood();
      break;
    case delete:
      deleteFood();
      break;
    default:
      //...
      break;
    }
  }
  
  public void addFood() {
    add Diet items and calories into diet ArrayList
  }

  public void listFood() {
    display Diet items in the ArrayList
  }

  public void deleteFood(int index) {
    delete items in list by specifying the index of the item
  }

  public void endDietSession() {
    end Diet recording 
  }
}