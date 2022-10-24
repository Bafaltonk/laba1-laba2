import java.util.Scanner;

// Класс определяет является ли строчка палиндромом.
public class Palindrome {

    // Главный метод класса Palindrome.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        args = s.split(" ");
        for (int i = 0; i < args.length; i++) {
            String str = args[i];
            System.out.print (str+" ");
            System.out.println (isPalindrome(str));
        }

    }

    // Строчковый метод для зеркального отражения строки.
    public static String reverseString(String s){
        String l;
        l = "";
        for (int i = s.length()-1; i > -1; i--){
            l += s.charAt(i);
        }
        return l;
    }

    // Булевый метод для определения является ли строчка палиндромом.
    public static boolean isPalindrome(String s){
        return s.equals(reverseString(s));
    }
}