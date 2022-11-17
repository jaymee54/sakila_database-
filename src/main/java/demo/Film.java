package demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="film")
public class Film {
    //Atributes
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmid;

    @ManyToMany(mappedBy = "films")
            @JsonIgnore
    List<Actor> actors;

    @Column(name = "title")
    String  filmtitle;

    @Column(name = "description")
    String  filmdescription;

    @Column(name = "release_year")
    int filmreleaseyear;

    @Column(name = "language_id")
    int filmlanguageid;

    @Column(name = "rental_duration")
    int  filmrentalduration;

    @Column(name = "rental_rate")
    double  filmrentalrate;

    @Column(name = "length")
    int  filmlength;

    @Column(name = "replacement_cost")
    double  filmreplacementcost;

    @Column(name = "rating")
    String filmrating;

    @Column(name = "special_features")
    String  filmspecialfeatures;

    @Column(name = "last_update")
    String  filmlastupdate;

    //Constructors

    public Film(String Mytitle, String Mydescription, int Myreleaseyear, int Mylanguageid, int Myrentalduration, double Myrentalrate, int Mylength, double Myreplacementcost, String Myrating, String Myspecialfeatures, String Mylastupdate){
        this.filmtitle = Mytitle;
        this.filmdescription = Mydescription;
        this.filmreleaseyear = Myreleaseyear;
        this.filmlanguageid = Mylanguageid;
        this.filmrentalduration = Myrentalduration;
        this.filmrentalrate = Myrentalrate;
        this.filmlength = Mylength;
        this.filmreplacementcost = Myreplacementcost;
        this.filmrating = Myrating;
        this.filmspecialfeatures = Myspecialfeatures;
        this.filmlastupdate = Mylastupdate;
   }

    public Film(){
    }

    //Methods


    public int getFilmid() {
        return filmid;
    }
    public void setFilmid(int filmid) {
        this.filmid = filmid;
    }

    public String getFilmtitle(){
        return  filmtitle;
    }
    public void setFilmtitle(String Mytitle){
        this.filmtitle = Mytitle;
    }

   public String getFilmdescription() {
        return filmdescription;
   }
    public void setFilmdescription(String filmdescription) {
        this.filmdescription = filmdescription;
    }

    public int getFilmreleaseyear() {
        return filmreleaseyear;
    }
    public void setFilmreleaseyear(int filmreleaseyear) {
        this.filmreleaseyear = filmreleaseyear;
    }

    public int getFilmlanguageid() {
        return filmlanguageid;
    }
    public void setFilmlanguageid(int filmlanguageid) {
        this.filmlanguageid = filmlanguageid;
    }

    public int getFilmrentalduration() {
        return filmrentalduration;
    }
    public void setFilmrentalduration(int filmrentalduration) {
        this.filmrentalduration = filmrentalduration;
    }

    public double getFilmrentalrate() {
        return filmrentalrate;
    }
    public void setFilmrentalrate(double filmrentalrate) {
        this.filmrentalrate = filmrentalrate;
    }

    public int getFilmlength() {
        return filmlength;
    }
    public void setFilmlength(int filmlength) {
        this.filmlength = filmlength;
    }

    public double getFilmreplacementcost() {
        return filmreplacementcost;
    }
    public void setFilmreplacementcost(double filmreplacementcost) {
        this.filmreplacementcost = filmreplacementcost;
    }

    public String getFilmrating() {
        return filmrating;
    }
    public void setFilmrating(String filmrating) {
        this.filmrating = filmrating;
    }

    public String getFilmspecialfeatures() {
        return filmspecialfeatures;
    }
    public void setFilmspecialfeatures(String filmspecialfeatures) {
        this.filmspecialfeatures = filmspecialfeatures;
    }

    public String getFilmlastupdate() {
        return filmlastupdate;
    }

    public void setFilmlastupdate(String filmlastupdate) {
        this.filmlastupdate = filmlastupdate;
    }
}
