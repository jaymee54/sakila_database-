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

    // @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    // @joinTable(name = "film_actor", joinColumns = @JoinColumn(name = "actor_id"),
    // inverseJoinColumns = @JoinColumn(name = film_id))

    List<Film> films;

    @Column(name = "first_name")
    String  actorfirstname;

    @Column(name = "last_name")
    String  actorlastname;

    // Constructors
    public Actor(String Myfirstname, String Mylastname){
        this.actorfirstname = Myfirstname;
        this.actorlastname = Mylastname;
    }
    public Actor(){
    }

    //Methods
    public String getfirstname(){
        return actorfirstname;
    }
    public void setfirstname(String actorfirstname){
        this.actorfirstname = actorfirstname;
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

