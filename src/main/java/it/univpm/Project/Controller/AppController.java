package it.univpm.Project.Controller;
import it.univpm.Project.Model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Vector;

@RestController
public class AppController {

    @PostMapping("/add")
    public boolean add(@RequestBody Student body){
        return true;
    }

}
