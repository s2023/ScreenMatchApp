import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("***************************");
        System.out.println("Welcome to ScreenMatchApp");
        System.out.println("Movie Matrix");

        int releaseDate = 1999;
        releaseDate = (int) 2000.0;

        double review = 4.5;
        boolean includedInPremium = true;
        String name = "Matrix";
        String synopsis = """
                The best movie of the end of the millennium
                "2020"
                """;
        double mediaUserReview = 0;

        System.out.println(releaseDate);
        System.out.println(review);
        System.out.println(includedInPremium);
        System.out.println(name);
        System.out.println(synopsis);

        double mediaRating = (4.5 +  4.8 + 3 ) / 3;
        System.out.println(mediaRating);
        System.out.println("Average rating of " + name + ": " + mediaRating);

        if (releaseDate >= 2023) {
            System.out.println("Popular movie at the time.");
        } else {
            System.out.println("Retro movie worth watching.");
        }

    //     Version 1 Rating Movie Calculator
    //    for (int i = 0; i < 3; i++) {
    //        Scanner teclado = new Scanner(System.in);
    //        System.out.println("Enter the grade you would give to Matrix");
    //        double noteMatrix = teclado.nextDouble();
    //        mediaUserReview = mediaUserReview + noteMatrix;
    //    }
    //    System.out.println("The average of the movie " +
    //            "Matrix calculated by the user is: " + mediaUserReview / 3);

        //Rating Movie Calculator
        Scanner sc = new Scanner(System.in);
        int number = 0;
            // 0 1 2
        System.out.println("- Rating Calculator:");
        while (number < 3 ){
            System.out.println("Enter the rating you would give to " + name + ": ");
            double noteMatrix = sc.nextDouble();
            mediaUserReview = mediaUserReview + noteMatrix;
            number ++;
        }

        System.out.println(mediaUserReview);

        DecimalFormat df = new DecimalFormat("0.00");
        String rounded = df.format(mediaUserReview / 3);

        System.out.println("The average of the movie " +
                name + " calculated by the user is: " + rounded);

    }

 }
