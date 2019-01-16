package restapi.practise2.test1.dataservices;

import org.springframework.data.jpa.repository.JpaRepository;
import restapi.practise2.test1.Model.usermodel;

public interface userdata_int extends JpaRepository<usermodel,Integer>
{


}

