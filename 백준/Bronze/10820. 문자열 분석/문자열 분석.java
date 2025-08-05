import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLine()){
      String str = sc.nextLine();
      int lower = 0;
      int upper = 0;
      int blank = 0;
      int num = 0;
      char[] arr = str.toCharArray();
      for(char ch : arr){
        if(ch == ' '){
          blank++;
        } else if (Character.isLowerCase(ch)) {
          lower++;
        } else if (Character.isUpperCase(ch)){
          upper++;
        } else if (Character.isDigit(ch)) {
          num++;
        }
      }
      System.out.printf("%d %d %d %d%n", lower, upper, num, blank);

    }

  }
}