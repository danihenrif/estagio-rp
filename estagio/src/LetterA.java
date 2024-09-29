import java.util.Scanner;

public class LetterA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String phrase = input.nextLine().toLowerCase();

        System.out.println("Enter a letter: ");
        Character letter = input.next().toLowerCase().charAt(0);



        Integer quantity = phrase.length() - phrase.replace(letter.toString(), "").length();

        System.out.println(quantity > 0 ? "Há " + quantity + " ocorrências" : "Não há ocorrências");

    }
}
