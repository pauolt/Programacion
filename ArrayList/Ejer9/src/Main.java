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

}

public class Main {
    public static void main(String[] args) {


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

        List<String> titulos = MovieOps.titlesUppercase(pelis);

        for (String titulo : titulos){
            System.out.println(titulo);
        }



    }
}