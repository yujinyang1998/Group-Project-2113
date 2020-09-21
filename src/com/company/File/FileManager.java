public class FileManager{
  
  public static void loadProfile(){
    if(find file exist){
      load values into array;
    }else{
      addProfile();
    }
  }

  private void addProfile(){

    scanner to get the user inputs
    name, height, weight, gender and age

    new ProfileManager(name, height, weight, gender and age);
  }

  public static void saveProfile(string name,int height,int weight,int age,int expected weight,string gender){
    saves the user profile
  }

  public static void writeProfile(){
    write to profile
  }
  
  public static void saveWorkout(){
    saves workout as a txt file
    with name as the date + a counter
    e.g. 3rd workout of the day will be 210920_03

    compareBest();
  }

  private void compareBest{
    compares the last workout with the best values so far.
    save the overtaken values as hidden values in case the user deletes a move
  }
  
}