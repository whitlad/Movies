import java.time.LocalDate;

/**

 * Person details
 * Represents a director or Actor in a movie
 *

 * @author Dawn Whitla

 *@version 24/04/2024

 **/


public abstract class Person {

    private String name;
    private String nationality;
    private LocalDate DOB;

    //CONSTRUCTOR

    /**
     * Constructor to create an object of the person class
     *
     * @param aName        the name of the person
     * @param aNationality the nationality of the person
     * @param aDOB         the date of birth of the person
     */

    public Person(String aName, String aNationality, LocalDate aDOB) {

        this.name = aName;
        this.nationality = aNationality;
        this.DOB = aDOB;


    }

    ///GETTER
    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public LocalDate getDOB() {
        return DOB;


    }

    //SETTER
    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    }


