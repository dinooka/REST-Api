package restapi.practise2.test1.Model;
import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "usertbl")
public class usermodel
{
    @Id
   // @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "userid")
    private Integer id;

    @Column(name =  "vehicle_No")
    private String vehicleno;

    @Column(name =  "lng")
    private  Float longtitude;

    @Column(name =  "lat")
    private  Float latitude;

    @Column(name =  "date")
    private Date date;

    @Column(name =  "time")
    private Time time;
}
