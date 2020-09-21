package com.company;

public class Main {

  Database db = new Database();

  public static void main(String[] args) {
    // write your code here
    FileManager.loadProfile();
    while(1) {

      use scanner to get input

      switch(scanner input):
      case"profile":
        // a static method in ProfileManager which is a big loop;
        ProfileManager.init();
        break;
        
      case"workout":
        // a static method in ProfileManager which is a big loop;
        WorkoutManger.init();
        break;

      case"diet":
        DietManager.init();
        break;

      case"exit":
        break;

      case"help":
        printHelp();
        break;

      default:
        notRecognisedHandler();
    }
  }

  private static void printHelp(){
      prints list of available commands
  }

    
}
//penis