public class ProfileManager {
  protected string name;
  protected int height;
  protected int weight;
  protected int age;
  protected int expectedWeight;
  protected string gender;
  
  public static init() {
    while(1) {
      if(input == update){
        update(args);
      }
      else if (input == view) {
        view(args);
      }
      else if(input == exit){
        break;
      }
    }
  }

  public ProfileManager (String ) {
  //  constructor to instantiate the profile for the first time
  }
   
  public float calculateBmi () {
    return (weight / (height*height));
  }

  public void view() {
    System.out.println("Your weight is "+ weight+ "kg.");
    System.out.println("Your height is "+ height+ "m.");
    System.out.println("Your BMI is "+ calculateBmi() +".");
    //print height weight, BMI = weight(kg) / height(m)^2
  }
  
  public void updateProfile(String action,int input) {
    switch (action) {
    case "n":
      name = input;
      break;
    case "h":
      height = input;
      break;
    case "w":
      weight = input;
      break;
    case "a":
      age = input;
      break;
    case "e":
      expectedWeight = input;
      break;
    case "g":
      gender = input;
    }
    FileManager.saveProfile(name,height,weight,age,expected weight,gender);
  }

  public void compare() {
    idek at this point 
  }
}