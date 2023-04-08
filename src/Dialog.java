import java.util.*;

public class Dialog {
    public static void main(String[] args) {
        Scanner convo = new Scanner(System.in);

        System.out.println("Hello! What's your name?");
        String name = convo.nextLine();

        System.out.println("Hi " + name + ", how are you feeling today?");
        String response = convo.nextLine();
        switch (response.toLowerCase()) {
            case "great":
                System.out.println("I'm glad to hear that!");
                break;
            case "okay":
                System.out.println("I hope your day gets better!");
                break;
            case "not good":
                System.out.println("I'm sorry to hear that. Is there anything I can do to help?");
                break;
            case "good" :
                System.out.println("Ohh!! thats great it means you have good capability to live life interesting...");
            default:
                System.out.println("Interesting response.");
        }

        System.out.println("What's your favorite food?");
        String food = convo.nextLine();
        if (food.equalsIgnoreCase("pizza")) {
            System.out.println("I love pizza too!");
        } else if (food.equalsIgnoreCase("sushi")) {
            System.out.println("Sushi is so delicious!");
        } else if (food.equalsIgnoreCase("tacos")) {
            System.out.println("Tacos are one of my favorites!");
        }else if (food.equalsIgnoreCase("Burger")){
            System.out.println("Burgers are too yumm, seriously i got heaven every time!");
        }else if (food.equalsIgnoreCase("noodle")){
            System.out.println("noodles are so wavy, if your fav is this, then you are special person yippy!!");
        }else {
            System.out.println("I've never tried that before.");
        }

        System.out.println("On a scale from 1 to 10, how much do you like going to the beach?");
        int rating = convo.nextInt();
        convo.nextLine();
        if (rating >= 8) {
            System.out.println("The beach is so much fun!");
        } else if (rating >= 5) {
            System.out.println("The beach can be nice, but it's not for everyone.");
        } else {
            System.out.println("I guess the beach isn't your favorite place.");
        }

        System.out.println("What's your favorite color?");
        String color = convo.nextLine();
        switch (color.toLowerCase()) {
            case "red":
                System.out.println("Red is a vibrant and exciting color!");
                break;
            case "blue":
                System.out.println("Blue is a calming and peaceful color.");
                break;
            case "green":
                System.out.println("Green is a refreshing and natural color!");
                break;
            case "black":
                System.out.println("black is self motivator and independent color");
                break;
            default:
                System.out.println("I'm not familiar with that color.");
        }

        System.out.println("How many hours of sleep do you usually get?");
        int hours = convo.nextInt();
        convo.nextLine();
        if (hours < 6) {
            System.out.println("You should try to get more sleep!");
        } else if (hours < 8) {
            System.out.println("That's a decent amount of sleep.");
        } else {
            System.out.println("You're getting plenty of sleep!");
        }

        System.out.println("It was nice talking to you, " + name + "! Goodbye.");
    }
}