import java.util.ArrayList;
import java.util.List;

record Movie (String title, double duration, double rating, int year){}

class MovieOps {

    static List<String> titlesUppercase (List<Movie> movies) {
        List<String> titulosEnMayusculas = new ArrayList<>();

        for (Movie movie : movies)  {
            titulosEnMayusculas.add(movie.title().toUpperCase());
        }

        return titulosEnMayusculas;

    }

    static Movie longest (List<Movie> movies) {
        Movie max = new Movie("0", 0, 0, 0);

        for (Movie movie : movies) {
            if (movie.duration() > max.duration()){
                max = movie;
            }
        }
        return max;
    }

    static Movie shortest (List<Movie> movies) {
        Movie min = new Movie("0", 99999, 0, 0);

        for (Movie movie : movies) {
            if (movie.duration() < min.duration()){
                min = movie;
            }
        }
        return min;
    }

    static List<Movie> afterYear (List<Movie> movies, int year){
        List<Movie> peliculasAfterYear = new ArrayList<>();
        for (Movie movie : movies){
            if (movie.year() > year){
                peliculasAfterYear.add(movie);
            }
        }
        return peliculasAfterYear;
    }

    static List<Movie> aboveRating (List<Movie> movies, double rating){
        List<Movie> peliculasAboveRating = new ArrayList<>();
        for (Movie movie : movies){
            if (movie.rating() > rating){
                peliculasAboveRating.add(movie);
            }
        }
        return peliculasAboveRating;
    }

    static List<Movie> longer (List<Movie> movies, double duration){
        List<Movie> peliculasLongerThan = new ArrayList<>();
        for (Movie movie : movies){
            if (movie.duration() > duration){
                peliculasLongerThan.add(movie);
            }
        }
        return peliculasLongerThan;
    }

    static List<Movie> yearReleased (List<Movie> movies, int year){
        List<Movie> peliculasYearReleased = new ArrayList<>();
        for (Movie movie : movies){
            if (movie.year() == year){
                peliculasYearReleased.add(movie);
            }
        }
        return peliculasYearReleased;
    }

    static List<Movie> sortByTitle (List<Movie> movies){
        List<Movie> moviesSorted = new ArrayList<>(movies);

        moviesSorted.sort((a, b) -> {
            String titleA = a.title();
            String titleB = b.title();

            if (titleA.compareTo(titleB) < 0) {
                return -1; // a va antes que b
            } else if (titleA.compareTo(titleB) > 0) {
                return 1;  // b va antes que a
            } else {
                return 0;  // Son iguales
            }
        });

        return moviesSorted;
    }

    static List<Movie> topRated (List<Movie> movies, int cantidad){
        List<Movie> moviesSorted = new ArrayList<>(movies);

        moviesSorted.sort((a, b) -> {
            if (a.rating() > b.rating()) {
                return -1; // a tiene mayor rating, va antes
            } else if (a.rating() < b.rating()) {
                return 1;  // b tiene mayor rating, va antes
            }
                return 0;  // Son iguales
        });

        return new ArrayList<>(moviesSorted.subList(0,cantidad));
    }

    static boolean allLonger (List<Movie> movies, double duration){
        for (Movie movie : movies){
            if (movie.duration() < duration){
                return false;
            }
        }
        return true;
    }

    static boolean anyRatedLower (List<Movie> movies, double rating) {
        for (Movie movie : movies){
            if (movie.rating() > rating){
            return false;
            }
        }
        return true;
    }

    static double averageRating (List<Movie> movies){
        double suma = 0;

        for (Movie movie : movies){
            suma += movie.rating();
        }

        return suma/movies.size();
    }

    static double totalDuration (List<Movie> movies){
        double suma = 0;
        for (Movie movie : movies){
            suma += movie.duration();
        }
        return suma;
    }

}

class MovieRepo {
    List<Movie> pelis = List.of(
            new Movie("The Shawshank Redemption", 142, 9.3, 1994),
            new Movie("The Godfather", 175, 9.2, 1972),
            new Movie("The Dark Knight", 152, 9.0, 2008),
            new Movie("Pulp Fiction", 154, 8.9, 1994),
            new Movie("The Lord of the Rings: The Return of the King", 201, 8.9, 2003),
            new Movie("Schindler's List", 195, 8.9, 1993),
            new Movie("Fight Club", 139, 8.8, 1999),
            new Movie("Inception", 148, 8.8, 2010),
            new Movie("Forrest Gump", 142, 8.8, 1994),
            new Movie("The Matrix", 136, 8.7, 1999),
            new Movie("Goodfellas", 146, 8.7, 1990),
            new Movie("Star Wars: Episode IV - A New Hope", 121, 8.6, 1977),
            new Movie("Interstellar", 169, 8.6, 2014),
            new Movie("The Silence of the Lambs", 118, 8.6, 1991),
            new Movie("Seven", 127, 8.6, 1995),
            new Movie("Gladiator", 155, 8.5, 2000),
            new Movie("The Green Mile", 189, 8.6, 1999),
            new Movie("The Prestige", 130, 8.5, 2006),
            new Movie("The Lion King", 88, 8.5, 1994),
            new Movie("The Departed", 151, 8.5, 2006),
            new Movie("Whiplash", 107, 8.5, 2014),
            new Movie("Parasite", 132, 8.6, 2019),
            new Movie("The Grand Budapest Hotel", 99, 8.1, 2014),
            new Movie("Django Unchained", 165, 8.4, 2012),
            new Movie("Joker", 122, 8.4, 2019)
    );

    void loadMovies (List<Movie> movies){
        pelis.addAll(movies);
    }

    double totalDurationOfMoviesAfterYear2000 (){
        return MovieOps.totalDuration(MovieOps.afterYear(pelis, 2000));
    }

    boolean longestIsInTopFive (){
        return MovieOps.topRated(pelis, 5).contains(MovieOps.longest(pelis));
    }

    List<Movie> ratingAboveAverage (){
        return new ArrayList<>(MovieOps.aboveRating(pelis, MovieOps.averageRating(pelis)));
    }

    boolean topTenLongerThan180 (){
        return MovieOps.allLonger(MovieOps.topRated(pelis, 10), 180);
    }

    boolean shortestInYear2000 (){
        return MovieOps.yearReleased(pelis, 2000).contains(MovieOps.shortest(pelis));
    }

    boolean twoHoursBetterThanThree (){
        return MovieOps.averageRating(MovieOps.longer(pelis, 120)) > MovieOps.averageRating(MovieOps.longer(pelis, 180));
    }

    boolean longerIsBetter (){
        return MovieOps.topRated(pelis, 1).contains(MovieOps.longest(pelis));
    }

    List<String> topThreeAfter1995 (){
        List<Movie> peliculas = new ArrayList<>(MovieOps.topRated(MovieOps.afterYear(pelis, 1995), 3));
        List<String> titulos = new ArrayList<>();
        for (Movie movie : peliculas){
            titulos.add(movie.title().toUpperCase());
        }
        return titulos;
    }



}


public class Main {
    public static void main(String[] args) {

        MovieRepo movieRepo = new MovieRepo();


        List<String> titulos = MovieOps.titlesUppercase(movieRepo.pelis);
        List<Movie> copia_pelis = new ArrayList<>(movieRepo.pelis);

        for (String titulo : titulos){
            System.out.println(titulo);
        }

        System.out.println("Pelicula más larga: " + MovieOps.longest(copia_pelis));
        System.out.println("Pelicula más corta : " + MovieOps.shortest(copia_pelis));
        System.out.println("Peliculas posteriores al año 2000 : " + MovieOps.afterYear(copia_pelis, 2000));
        System.out.println("Peliculas con un rating superior a 8.8 : " + MovieOps.aboveRating(copia_pelis, 8.8));
        System.out.println("Peliculas con una duración superior a 140 min : " + MovieOps.longer(copia_pelis, 140));
        System.out.println("Peliculas lanzadas en el año 1999 : " + MovieOps.yearReleased(copia_pelis, 1999));
        System.out.println("Peliculas ordenadas por titulo : " + MovieOps.sortByTitle(copia_pelis));
        System.out.println("Top 5 peliculas mejor valoradas: " + MovieOps.topRated(copia_pelis, 5));
        System.out.println("¿Duran las todas las peliculas más de 120 min?: " + MovieOps.allLonger(copia_pelis, 120));
        System.out.println("¿Tienen todas las peliculas un rating inferior a 8.8?: " + MovieOps.anyRatedLower(copia_pelis, 8.8));
        System.out.println("El rating medio de las peliculas es de: " + MovieOps.averageRating(copia_pelis));
        System.out.println("La duracion acumulada de todas las peliculas es de: " + MovieOps.totalDuration(copia_pelis) + " mins o " + MovieOps.totalDuration(copia_pelis)/60 + " horas");
        System.out.println("La duracion acumulada de las peliculas lanzadas despues del 2000 es de: " + movieRepo.totalDurationOfMoviesAfterYear2000());
        System.out.println("¿La pelicula más larga esta en el top 5 mejor valoradas?: " + movieRepo.longestIsInTopFive());
        System.out.println("Peliculas con un rating superior al de la media: " + movieRepo.ratingAboveAverage());
        System.out.println("¿Todas las peliculas en el top 10 mejor valoradas duran más de 3 horas?: " + movieRepo.topTenLongerThan180());
        System.out.println("¿La pelicula más corta se lanzó en año 2000?: " + movieRepo.shortestInYear2000());
        System.out.println("¿Las peliculas de 2 horas estan mejor valoradas que las de 3?: " + movieRepo.twoHoursBetterThanThree());
        System.out.println("¿La pelicula más larga es la mejor valorada?: " + movieRepo.longerIsBetter());
        System.out.println("Titulos en Mayus de las 3 peliculas mejor valoradas lanzadas después del 1995: " + movieRepo.topThreeAfter1995());







    }
}