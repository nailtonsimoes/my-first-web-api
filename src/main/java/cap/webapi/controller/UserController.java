package cap.webapi.controller;

import cap.webapi.model.User;
import cap.webapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping()
    public List<User>getUsers(){
        return repository.fndAll();
    }
    @GetMapping("/{username}")
    public User getOne(@PathVariable("username") String username){
        return repository.finByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.remove(id);
    }

    @PostMapping()
    public void postUser(@RequestBody User usuario){
    repository.save(usuario);
    }

    @PutMapping()
    public void putUser(@RequestBody User usuario){
        repository.save(usuario);
    }
}
