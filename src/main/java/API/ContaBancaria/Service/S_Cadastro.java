package API.ContaBancaria.Service;

import org.springframework.stereotype.Service;

@Service
public class S_Cadastro {

    public static String validaCadastro(String nome, String email, String senha){
        String mensagem = "";
        boolean podeSalvar = true;

        if(nome == null || nome.trim().equals("")){
            mensagem += "O nome precisa ser preenchido\n";
            podeSalvar = false;
        }
        if(email == null || email.trim().equals("")){
            mensagem += "O e-Mail precisa ser preenchido\n";
            podeSalvar = false;
        }

        if(podeSalvar){
            M_Pessoa m_pessoa = new M_Pessoa();
            m_pessoa.setNome(nome);
            m_pessoa.setEmail(email);
            m_pessoa.setUsuario(usuario);
            m_pessoa.setSenha(senha);
            r_pessoa.save(m_pessoa);
            mensagem += "Cadastro Salvo com Sucesso!";
        }

        return mensagem;
    }
}