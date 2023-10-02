package API.ContaBancaria.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class C_Cadastro {

    @GetMapping("/")
    public String getCadastro(){
        return "Cadastro/usuario";
    }

    @PostMapping("/")
    public String postCadastro(){
        return null;
    }
}