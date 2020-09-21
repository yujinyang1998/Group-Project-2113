public void DietManager() {
  public static initDietManager() {
    while(1) {
      if(input == STARTDIETSESSION_COMM){
        startDietSession();
      } else if(input == LISTDIET_COMM) {
        listDiet();
      } else if(input == DELETEDIET_COMM) {
        deleteDiet();
      } else if(input == EXITDIETMANAGER_COMM){
        break;
      }
    }
  }
  public void startDietSession(){
    DietSession ds = new DietSession();
    ds.startDiet();
  }

  public void listDiet(){
  }

  public void deleteDiet(){
  }

  public void exitDietManager() {
  }

}