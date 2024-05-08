import java.util.Scanner;

import model.Movie;
import model.Serie;

public class Principal {

    public void showMenu(){
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 9){
            String menu = """
                    \n*************** Welcome to ScreenMatchApp ***************
                    1) Register new movie
                    2) Register new Serie
                    3) Calculate movie marathon
                    
                    9) Exit
                    """;
            System.out.println(menu);
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {

                case 1:
                    System.out.println("Enter the movie name:");
                    String movieName = sc.nextLine();
                    System.out.println("Enter the year the movie was released:");
                    int releaseYearMovie = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter duration time in minutes of the movie:");
                    int durationMovie = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the movie synopsis:");
                    String synopsisMovie = sc.nextLine();
                    Movie userMovie = new Movie();
                    userMovie.setname(movieName);
                    userMovie.setreleaseDate(releaseYearMovie);
                    userMovie.setdurationOnMinutes(durationMovie);
                    userMovie.setsynopsis(synopsisMovie);

                    userMovie.showDataSheet();
                    break;

                case 2:
                    System.out.println("Enter the serie name:");
                    String serieName = sc.nextLine();
                    System.out.println("Enter the year the serie was released:");
                    int releaseYearSerie = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the length of the chapters in minutes:");
                    int minutesByEpisode = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the number of episodes per season:");
                    int episodesBySeason = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the number of seasons:");
                    int seasonsSerie = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the serie synopsis:");
                    String synopsisSerie = sc.nextLine();
                    Serie userSerie = new Serie();
                    userSerie.setname(serieName);
                    userSerie.setreleaseDate(releaseYearSerie);
                    userSerie.setepisodesBySeason(episodesBySeason);
                    userSerie.setminutesByEpisode(minutesByEpisode);
                    userSerie.setseason(seasonsSerie);
                    userSerie.setsynopsis(synopsisSerie);

                    userSerie.showDataSheet();
                    break;

                case 3:
                    System.out.println("How many movies are you going to see in your marathon?");
                    int numberTitles = sc.nextInt();
                    sc.nextLine();
                    Movie[] marathon = new Movie[numberTitles];
                    int marathonDuration = 0;
                    System.out.println("*******************************");
                    for (int i = 0; i < numberTitles; i++) {
                        marathon[i] = new Movie();
                        System.out.println("Enter the movie name " + (i+1) + ":");
                        String movieNameMarathon= sc.next();
                        marathon[i].setname(movieNameMarathon);
                        System.out.println("Enter duration time in minutes of the movie "  + (i+1) + ":");
                        int duration = sc.nextInt();
                        sc.nextLine();
                        marathon[i].setdurationOnMinutes(duration);

                        marathonDuration += marathon[i].getdurationOnMinutes();
                        System.out.println("Movie: " + marathon[i].getname() + 
                                            "\nDuration in minutes: " + marathon[i].getdurationOnMinutes());
                    }
                    System.out.println("Your marathon will last " + marathonDuration + " minutes.\n");
                    break;

                case 9:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;

            }
        }
    }

}
