class StrPractice {
  public static void main(String[] args) {
    String name = "Dog Doge";
    System.out.println(name);

    int index = name.indexOf(' ');
    System.out.println(index);

    String firstName = name.substring(0, index);
    System.out.println(firstName);

    String lastName = name.substring(index+1);
    System.out.println(lastName);

    int firstLength = firstName.length();
    System.out.println(firstLength);

    String friendName = "Cat Katt";
    System.out.println(name.compareTo(friendName));


    String prefix = "@real";
    // three methods in one line! concatenates to strings, puts the result in lowercase, and removes spaces
    String handle = prefix.concat(name).toLowerCase().replaceAll("\\s+", "");
    System.out.println(handle);
  }
}