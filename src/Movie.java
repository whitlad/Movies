import jdk.nashorn.internal.objects.annotations.Setter;

import java.time.LocalDate;
import java.util.HashSet;


/**
 * Movie details
 * represents a movie
 * @author Dawn Whitla
 * @version 24/02/2024
 */

public class Movie {

    private String title;
    private LocalDate releaseYear;

    private int length;



    //private Genre genre; //movie has a Genre - this is COMPOSITION

    private HashSet<Genre> genres;

    private HashSet<Actor> actors;

    private HashSet<Director> directors;

    public Movie(String aTitle, LocalDate aReleaseYear, int aLength, HashSet<Genre> genres, HashSet<Director> directors, HashSet<Actor> actors)
{

    this.title = aTitle;
    this.releaseYear = aReleaseYear;
    this.length = aLength;
    this.genres = genres;
    this.directors = directors;
    this.actors = actors;

}
    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseYear;
    }

    public int getLength() {
        return length;
    }
    //you can return collection fields

    public HashSet<Genre> getGenres()
    {
        return this.genres;
    }

    /**
     * adds a genre to the collection of genres
     * @param g the genre to add
     */

    public void addGenre(Genre g)  //to allow
    {
        this.genres.add(g);


    }
    public HashSet<Director> getDirectors()
    {
        return this.directors;
    }
    /**
     * adds a director to the collection of directors
     * @param d the director to add
     */
    public void addDirector(Director d)  //to allow
    {
        this.directors.add(d);
    }



    public HashSet<Actor> getActors()
    {
        return this.actors;
    }

    /**
     * adds an actor to the collection of actors
     * @param a the actor to add
     */
    public void addActor(Actor a)  //to allow
    {
        this.actors.add(a);
    }


//no constructor as it won't change
//no setter as it's just get the information and don't want to delete

//list all movies - how to list all movies
public void ListAllTitles(){
        for (Movie eachMovie : this.movies)

        {
            System.out.print("Title" + eachMovie.getTitle() + "Year" + eachMovie.getReleaseDate() + "Director" + eachMovie.getDirectors() + "Actor" + eachMovie.getActors());

            System.out.println(eachMovie);
        }
}

{

}

}