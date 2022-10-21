package demo;

import org.springframework.transaction.interceptor.MatchAlwaysTransactionAttributeSource;

import javax.persistence.*;

@Entity
@Table(name ="film")
public class film {
    //Atributes
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmid;

    @Column(name = "title")
    String  filmtitle;

    @Column(name = "description")
    String  filmdescription;

    @Column(name = "release_date")
    String  filmreleasedate;

    @Column(name = "Language_id")
    int  filmrlanguageid;

    @Column(name = "rental_duration")
    int  filmrentalduration;

    @Column(name = "rental_rate")
    double  filmrentalrate;

    @Column(name = "length")
    int  filmlength;

    @Column(name = "replacement_cost")
    double  filmreplacementcost;

    @Column(name = "rating")
    double filmrating;

    @Column(name = "special_features")
    String  filmspecialfeatures;

    @Column(name = "last_update")
    String  filmlastupdate;

    //Constructors

    public film(String Mytitle,String Mydescription, String Myreleasedate, int Mylanguageid, int Myrentalduration, double Myrentalrate, int Mylength, double Myreplacementcost, double Myrating, String Myspecialfeatures, String Mylastupdate){
        this.filmtitle = Mytitle;
        this.filmdescription = Mydescription;
        this.filmreleasedate = Myreleasedate;
        this.filmrlanguageid = Mylanguageid;
        this.filmrentalduration = Myrentalduration;
        this.filmrentalrate = Myrentalrate;
        this.filmlength = Mylength;
        this.filmreplacementcost = Myreplacementcost;
        this.filmrating = Myrating;
        this.filmspecialfeatures = Myspecialfeatures;
        this.filmlastupdate = Mylastupdate;
    }

    public film(){
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

}
