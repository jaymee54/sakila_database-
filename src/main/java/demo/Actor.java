package demo;

import javax.persistence.*;

@Entity
@Table(name ="actor")
public class Actor {

    //Atributes
    @Id
    @Column(name = actorid)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actorid;

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
    public void setactorid(String actorid){
        this.actorid = actorid;
    }
}

