import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StringProject {
    public static void main(String[] args) {
    String message = "Bugün hava çok güzel";
    System.out.println(message);

    System.out.println("Eleman Sayısı: " +message.length());
    System.out.println("5.Eleman: "+ message.charAt(4));
    System.out.println(message.concat("Yaşasın!"));
    System.out.println(message);
    System.out.println(message.startsWith("B"));
    System.out.println(message.endsWith("."));
    char[] charachters = new char[5];
    message.getChars(0,4,charachters,0);
    System.out.println(charachters);
    System.out.println(message.indexOf("a"));
    System.out.println(message.toLowerCase());
    System.out.println(message.toLowerCase(Locale.ROOT));
    System.out.println(message.toUpperCase());
    System.out.println(message.getBytes());
    System.out.println(message.substring(0,5));
    System.out.println(message.codePointAt(2));
    System.out.println(message.contains("B"));
    System.out.println(message.replace("Bugün","Yarın"));
    System.out.println(message.codePointCount(1,5));
    System.out.println(message.hashCode());
    System.out.println(message.describeConstable());
    }
}