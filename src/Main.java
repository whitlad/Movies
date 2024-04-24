// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.time.LocalDate;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
      HashSet<Genre> genres = new HashSet<>();
      HashSet<Director> directors = new HashSet<>();

      HashSet<Actor> actors = new HashSet<>();




      LocalDate ldm1 = LocalDate.parse("1999-01-23");
      genres.add(Genre.Horror);
      genres.add(Genre.Thriller);
      Movie m1 = new Movie("Cape Fear", ldm1, 128,genres,directors,actors);

      LocalDate ldm2 = LocalDate.parse("1999-01-23");
      genres.add(Genre.Horror);
      Movie m2 = new Movie("BeetleJuice", ldm2, 92, genres, directors, actors);


      LocalDate ldm3 = LocalDate.parse("1999-01-23");
      genres.add(Genre.Fantasy);
      Movie m3 = new Movie("Lord of the Rings - The Fellowship of the Ring", ldm3, 178, genres, directors, actors);


      LocalDate ldm4 = LocalDate.parse("1999-01-23");
      genres.add(Genre.Psychological);
      Movie m4 = new Movie("Fight Club", ldm4, 139, genres,directors,actors);




      LocalDate ldd1 = LocalDate.parse("1961-01-23");
      Director d1 = new Director("Martin Scorsese", "American", ldd1);
      directors.add(d1);

      LocalDate ldd2 = LocalDate.parse("1961-01-23");
      Director d2 = new Director("Peter Jackson", "New Zeland", ldd2);
      directors.add(d2);

      LocalDate ldd3 = LocalDate.parse("1958-01-23");
      Director d3 = new Director("Tim Burton", "American", ldd3);
      directors.add(d3);
      LocalDate ldd4 = LocalDate.parse("1962-01-23");
      Director d4 = new Director("David Fincher", "American", ldd4);
      directors.add(d4);



      LocalDate lda1 = LocalDate.parse("1963-01-23");
      Actor a1 = new Actor("Johnny Depp", "American", lda1);
      actors.add (a1);

      LocalDate lda2 = LocalDate.parse("1981-01-23");
      Actor a2 = new Actor("Elijah Wood", "American", lda2);
      actors.add (a2);
      LocalDate lda3 = LocalDate.parse("1943-01-23");
      Actor a3 = new Actor("Rober De Niro", "American", lda3);
      actors.add (a3);

      LocalDate lda4 = LocalDate.parse("1966-01-23");
      Actor a4= new Actor("Helena Bonham Carter", "British",lda4);
      actors.add (a4);








    }
}
