package demo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="actor")
public class Actor {

    //Atributes
    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actorid;

     @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
     @JoinTable(name = "film_actor", joinColumns = @JoinColumn(name = "actor_id"),
    inverseJoinColumns = @JoinColumn(name = "film_id"))

    List<Film> films;

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    @Column(name = "first_name")
    String firstname;

    @Column(name = "last_name")
    String  actorlastname;

    // Constructors
    public Actor(String Myfirstname, String Mylastname){
        this.firstname = Myfirstname;
        this.actorlastname = Mylastname;
    }
    public Actor(){
    }

    //Methods
    public String getfirstname(){
        return firstname;
    }
    public void setfirstname(String actorfirstname){
        this.firstname = actorfirstname;
    }

    public String getlastname(){
        return actorlastname;
    }
    public void setlastname(String actorlastname){
        this.actorlastname = actorlastname;
    }
    public int getactorid(){
        return actorid;
    }
    public void setactorid(int actorid){
        this.actorid = actorid;
    }
}

