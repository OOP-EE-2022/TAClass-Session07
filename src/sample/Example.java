package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        Person person = new Person("Ali", Gender.MALE);
        Person person2 = new Person("Fatemeh", Gender.FEMALE);

        if (person.gender == person2.gender) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (Gender.MALE.isMatch(input)) {
            System.out.println("is male");
        } else if (Gender.FEMALE.isMatch(input)) {
            System.out.println("is female");
        } else {
            System.out.println("not male , not female");
        }

    }
}
