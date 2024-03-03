import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Bir cümlenin palindrome olup olmadığını bulma
        //baştan okunuşuyla sondan okunuşu aynıysa palindromedur
        //kasaylabalyasak

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kontrol Edeceğimiz Cümleyi Yazınız.:");
        String cumle = scanner.nextLine();

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0 ; i < cumle.length() / 2 ; i++){
            stack.push(cumle.charAt(i)); // Stringde charAt o anki string in karakterini verir
        }
        if (isPalindrome(cumle , stack)){
            System.out.println("Bu Cümle Palindromedur...");
        }
        else {
            System.out.println("Bu Cümle Palindrome Değildir");
        }

    }
    public static boolean isPalindrome(String cumle , Stack<Character> stack){

        for (int i = (cumle.length() / 2 ) + 1 ; i < cumle.length() ; i++){

            //lenght uzunluğunu verir baana
            if (cumle.charAt(i) != stack.pop()){
                return false;
            }


        }
        return true;

    }
}