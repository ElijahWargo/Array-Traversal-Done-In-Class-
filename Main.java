class Main {
  public static void main(String[]args) {
    String[] gamingDevice = {"Xbox", "Play Station", "Switch", "Computer", "Wii"};

  for(int i = 0; i < 6; i++){
    System.out.println( "The gaming device is " + gamingDevice[i]);
  }

  gamingDevice[6] = "Game Cube";

  for(int i = 0; i < 6; i++){
    System.out.println( "The update " + gamingDevice[i]);
  }

  }
}