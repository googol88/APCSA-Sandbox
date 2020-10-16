class StaticMethods {
  // precondition: name has first and last separated by single space
  // static methods don't get called on instances, so it's not dotted onto anything since there no instance is created
  public static String getInitials(String name) {
    String fInit = name.substring(0, 1); // name.charAt(0)
    int index = name.indexOf(" ");
    String lInit = name.substring(index+1, index+2); // name.charAt(index+1)
    return fInit+lInit;
  }

  // time formatted as "HH:MM" e.g. "10:41", 20 -> "11:01"
  public static String calculateTime(String time, int minutes) {
    int colonIndex = time.indexOf(":"); // colon used for 
    int currentMin = Integer.parseInt(time.substring(colonIndex+1));
    int currentHour = Integer.parseInt(time.substring(0, colonIndex));
    int newMin = (currentMin+minutes)%60;
    int newHour = currentHour+(currentMin+minutes)/60;
    if(newMin < 10) {
      return newHour+":0"+newMin;
    } else {
      return newHour+":"+newMin;
    }
  }

  public static void main(String[] args) {
    System.out.println(calculateTime("10:41", 20));
  }
}