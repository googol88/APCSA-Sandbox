import java.util.Locale;
 
public class Main {
 public static void main(String[] args) {
   Locale locale = new Locale("en_US");
   // yes, Locale is overloaded
   char initial = 'R';
   String extension = locale.getExtension(initial);
   Locale def = Locale.getDefault();
   String localeStr = locale.toString();
 }
}
