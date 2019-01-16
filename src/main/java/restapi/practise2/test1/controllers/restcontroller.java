package restapi.practise2.test1.controllers;

        import org.springframework.beans.factory.annotation.Autowired;
        import restapi.practise2.test1.services.userservicesint;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class restcontroller
{

    @Autowired
    private userservicesint userservicesint;

    @GetMapping("/all")
    public  String getallusers()
    {
        return userservicesint.findallusers();
    }
}
