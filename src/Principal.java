import javax.swing.JOptionPane;
//v1 import java.util.Scanner;
import model.Movie;
import model.Serie;

public class Principal {

    public void showMenu(){

        //v1 Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 9){
            String menu = """
                            *************** Welcome to ScreenMatchApp ***************
                            1) Register new movie.
                            2) Register new Serie.
                            3) Calculate movie marathon.
                            
                            9) Exit.
                        """;
            String optionInput = JOptionPane.showInputDialog(null, menu + "\nEnter an option:", "ScreenMatchApp", 1);
            option = Integer.parseInt(optionInput);
            //v1 System.out.println(menu);
            // menu1 = Interger.parseint(JoptionsPane.showInputDialog(null, "Digite el primer número que desea sumar"))
            //v1 option = sc.nextInt();
            //v1 sc.nextLine();
            switch (option) {

                case 1:
                    String movieName = JOptionPane.showInputDialog(null, "Enter the movie name:", "ScreenMatchApp", 3);
                    //v1 System.out.println("Enter movie name:");
                    //v1 String movieName = sc.nextLine();
                    String releaseYearInput = JOptionPane.showInputDialog(null, "Enter year the movie was released:", "ScreenMatchApp", 3);
                    int releaseYearMovie = Integer.parseInt(releaseYearInput);
                    //v1 System.out.println("Enter year the movie was released:");
                    //v1 int releaseYearMovie = sc.nextInt();
                    //v1 sc.nextLine();
                    String durationInput = JOptionPane.showInputDialog(null, "Enter duration time in minutes of movie:", "ScreenMatchApp", 3);
                    int durationMovie = Integer.parseInt(durationInput);
                    //v1 System.out.println("Enter duration time in minutes of movie:");
                    //v1 int durationMovie = sc.nextInt();
                    //v1 sc.nextLine();
                    String synopsisMovie = JOptionPane.showInputDialog(null, "Enter movie synopsis:", "ScreenMatchApp", 3);                    
                    //v1 System.out.println("Enter movie synopsis:");
                    //v1 String synopsisMovie = sc.nextLine();
                    Movie userMovie = new Movie();
                    userMovie.setname(movieName);
                    userMovie.setreleaseDate(releaseYearMovie);
                    userMovie.setdurationOnMinutes(durationMovie);
                    userMovie.setsynopsis(synopsisMovie);
                    userMovie.showDataSheet();
                    break;

                case 2:                
                    String serieName = JOptionPane.showInputDialog(null, "Enter the serie name:", "ScreenMatchApp", 3);
                    //v1 System.out.println("Enter serie name:");
                    //v1 String serieName = sc.nextLine();
                    String releaseYInput = JOptionPane.showInputDialog(null, "Enter year the serie was released:", "ScreenMatchApp", 3);
                    int releaseYearSerie = Integer.parseInt(releaseYInput);
                    //v1 System.out.println("Enter year the serie was released:");
                    //v1 int releaseYearSerie = sc.nextInt();
                    //v1 sc.nextLine();
                    String minutesBEInput = JOptionPane.showInputDialog(null, "Enter length of the chapters in minutes:", "ScreenMatchApp", 3);
                    int minutesByEpisode = Integer.parseInt(minutesBEInput);
                    //v1 System.out.println("Enter length of the chapters in minutes:");
                    //v1 int minutesByEpisode = sc.nextInt();
                    //v1 sc.nextLine();
                    String episodesBSInput = JOptionPane.showInputDialog(null, "Enter number of episodes per season:", "ScreenMatchApp", 3);
                    int episodesBySeason = Integer.parseInt(episodesBSInput);
                    //v1 System.out.println("Enter number of episodes per season:");
                    //v1 int episodesBySeason = sc.nextInt();
                    //v1 sc.nextLine();
                    String seasonsSInput = JOptionPane.showInputDialog(null, "Enter the number of seasons:", "ScreenMatchApp", 3);
                    int numberSeasonsSerie = Integer.parseInt(seasonsSInput);
                    //v1 System.out.println("Enter number of seasons:");
                    //v1 int numberSeasonsSerie = sc.nextInt();
                    //v1 sc.nextLine();
                    String synopsisSerie = JOptionPane.showInputDialog(null, "Enter serie synopsis:", "ScreenMatchApp", 3); 
                    //v1 System.out.println("Enter the serie synopsis:");
                    //v1 String synopsisSerie = sc.nextLine();
                    Serie userSerie = new Serie();
                    userSerie.setname(serieName);
                    userSerie.setreleaseDate(releaseYearSerie);
                    userSerie.setepisodesBySeason(episodesBySeason);
                    userSerie.setminutesByEpisode(minutesByEpisode);
                    userSerie.setseason(numberSeasonsSerie);
                    userSerie.setsynopsis(synopsisSerie);
                    userSerie.showDataSheet();
                    break;

                case 3:
                    String numberMInput = JOptionPane.showInputDialog(null, "How many movies are you going to see in your marathon?", "ScreenMatchApp", 3);
                    int numberTitles = Integer.parseInt(numberMInput);
                    //v1 System.out.println("How many movies are you going to see in your marathon?");
                    //v1 int numberTitles = sc.nextInt();
                    //v1 sc.nextLine();
                    Movie[] marathon = new Movie[numberTitles];
                    int marathonDuration = 0;
                    //v1 System.out.println("*******************************");
                    for (int i = 0; i < numberTitles; i++) {
                        marathon[i] = new Movie();
                        String movieNameMarathon = JOptionPane.showInputDialog(null, "Enter the movie name " + (i+1) + ":", "ScreenMatchApp", 3);
                        //v1 System.out.println("Enter the movie name " + (i+1) + ":");
                        //v1 String movieNameMarathon= sc.next();
                        marathon[i].setname(movieNameMarathon);
                        String durationMMInput = JOptionPane.showInputDialog(null, "Enter duration time in minutes of the movie " + (i+1) + ":", "ScreenMatchApp", 3);
                        int duration = Integer.parseInt(durationMMInput);
                        //v1 System.out.println("Enter duration time in minutes of the movie "  + (i+1) + ":");
                        //v1 int duration = sc.nextInt();
                        //v1 sc.nextLine();
                        marathon[i].setdurationOnMinutes(duration);

                        marathonDuration += marathon[i].getdurationOnMinutes();
                        String messageMarathon = "Movie: " + marathon[i].getname() + 
                                                "\nDuration in minutes: " + marathon[i].getdurationOnMinutes();
                        JOptionPane.showMessageDialog(null, messageMarathon);
                        //v1 System.out.println("Movie: " + marathon[i].getname() + 
                        //                     "\nDuration in minutes: " + marathon[i].getdurationOnMinutes());
                    }
                    String messageMarathonFinal = "Your marathon will last " + marathonDuration + " minutes.\n";
                    JOptionPane.showMessageDialog(null, messageMarathonFinal);
                    //v1 System.out.println("Your marathon will last " + marathonDuration + " minutes.\n");
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "Exiting the program...");
                    //v1 System.out.println("Exiting the program...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option.");
                    //v1 System.out.println("Invalid option.");
                    break;

            }
        }
        
    }

}
