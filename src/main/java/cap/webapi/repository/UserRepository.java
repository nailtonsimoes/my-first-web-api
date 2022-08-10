package cap.webapi.repository;

import cap.webapi.handler.BusinessException;
import cap.webapi.handler.CampoObrigatorioException;
import cap.webapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User usuario){

        if(usuario.getPassword()==null)
            throw new CampoObrigatorioException("password");

        if(usuario.getLogin()==null)
            throw new CampoObrigatorioException("login");

        if(usuario.getId()==null)
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }
    public void update(User usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<User> fndAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<User> usuarios = new ArrayList<>();
        usuarios.add(new User("gleyson","password"));
        usuarios.add(new User("frank","masterpass"));
        return usuarios;
    }

    public User finById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("gleyson","password");
    }

    public User finByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
        return new User("gleyson","password");
    }
}

