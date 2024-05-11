import javax.swing.JOptionPane;
import model.Movie;
import model.Serie;

public class Principal {

    public void showMenu(){

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
            switch (option) {

                case 1:
                    String movieName = JOptionPane.showInputDialog(null, "Enter the movie name:", "ScreenMatchApp", 3);
                    String releaseYearInput = JOptionPane.showInputDialog(null, "Enter year the movie was released:", "ScreenMatchApp", 3);
                    int releaseYearMovie = Integer.parseInt(releaseYearInput);
                    String durationInput = JOptionPane.showInputDialog(null, "Enter duration time in minutes of movie:", "ScreenMatchApp", 3);
                    int durationMovie = Integer.parseInt(durationInput);
                    String synopsisMovie = JOptionPane.showInputDialog(null, "Enter movie synopsis:", "ScreenMatchApp", 3);                    
                    Movie userMovie = new Movie();
                    userMovie.setname(movieName);
                    userMovie.setreleaseDate(releaseYearMovie);
                    userMovie.setdurationOnMinutes(durationMovie);
                    userMovie.setsynopsis(synopsisMovie);
                    userMovie.showDataSheet();
                    break;

                case 2:                
                    String serieName = JOptionPane.showInputDialog(null, "Enter the serie name:", "ScreenMatchApp", 3);
                    String releaseYInput = JOptionPane.showInputDialog(null, "Enter year the serie was released:", "ScreenMatchApp", 3);
                    int releaseYearSerie = Integer.parseInt(releaseYInput);
                    String minutesBEInput = JOptionPane.showInputDialog(null, "Enter length of the chapters in minutes:", "ScreenMatchApp", 3);
                    int minutesByEpisode = Integer.parseInt(minutesBEInput);
                    String episodesBSInput = JOptionPane.showInputDialog(null, "Enter number of episodes per season:", "ScreenMatchApp", 3);
                    int episodesBySeason = Integer.parseInt(episodesBSInput);
                    String seasonsSInput = JOptionPane.showInputDialog(null, "Enter the number of seasons:", "ScreenMatchApp", 3);
                    int numberSeasonsSerie = Integer.parseInt(seasonsSInput);
                    String synopsisSerie = JOptionPane.showInputDialog(null, "Enter serie synopsis:", "ScreenMatchApp", 3); 
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
                    Movie[] marathon = new Movie[numberTitles];
                    int marathonDuration = 0;
                    for (int i = 0; i < numberTitles; i++) {
                        marathon[i] = new Movie();
                        String movieNameMarathon = JOptionPane.showInputDialog(null, "Enter the movie name " + (i+1) + ":", "ScreenMatchApp", 3);
                        marathon[i].setname(movieNameMarathon);
                        String durationMMInput = JOptionPane.showInputDialog(null, "Enter duration time in minutes of the movie " + (i+1) + ":", "ScreenMatchApp", 3);
                        int duration = Integer.parseInt(durationMMInput);
                        marathon[i].setdurationOnMinutes(duration);

                        marathonDuration += marathon[i].getdurationOnMinutes();
                        String messageMarathon = "Movie: " + marathon[i].getname() + 
                                                "\nDuration in minutes: " + marathon[i].getdurationOnMinutes();
                        JOptionPane.showMessageDialog(null, messageMarathon);
                    }
                    String messageMarathonFinal = "Your marathon will last " + marathonDuration + " minutes.\n";
                    JOptionPane.showMessageDialog(null, messageMarathonFinal);
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "Exiting the program...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option.");
                    break;

            }
        }
        
    }

}
