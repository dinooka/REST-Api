package restapi.practise2.test1.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class userservicesclz implements  userservicesint
{
    @Autowired
    private userservicesint userservicesint;

    @Override
    public String findallusers() {
        return "users";


    }
}
