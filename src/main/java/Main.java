import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    //method that prompts user for input
    public static void promptUser() {
        System.out.println("Enter a sentence: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        //if input is a number, return error
        if (sentence.matches("[0-9]+")) {
            System.out.println("Error: Input must be a string");
            return;
        }
        String inverted = StringUtils.swapCase(sentence);
        System.out.println(inverted);
        String reversed = StringUtils.reverse(sentence);
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        promptUser();
    }

}
