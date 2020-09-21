public class WorkoutSession {

  public void startWorkoutSession() {
    while(1) {
      if(input == list){
        list(args);
      }
      else if(input == exit){
        break;
      }
    }
  }

  public void addMove(String name, double weight, int reps) {

    FileManager.saveWorkout();//appends the save file
  }

  public void listMove() {
  }
  
  public void deleteMove(int index) {
    remove index th move record
  }

  public void endWorkout() {
  }
}