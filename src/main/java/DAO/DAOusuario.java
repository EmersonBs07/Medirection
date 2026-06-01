package DAO;


import ConexaoBD.ConexaoBD;
import Usuario.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOusuario{

public void cadastrarUsuario(Usuario usuario) throws Exception {
    String sql = "INSERT INTO usuario (nome, email, senha, deficiencia) VALUES (?, ?, ?, ?)";

    Connection conn = ConexaoBD.obtemConexao();
    PreparedStatement ps = conn.prepareStatement(sql);

    ps.setString(1, usuario.getNome());
    ps.setString(2, usuario.getEmail());
    ps.setString(3, usuario.getSenha());
    ps.setString(4, usuario.getDeficiencia());

    ps.executeUpdate();
}
public boolean existe(Usuario usuario) throws Exception {
    String sql = "SELECT * FROM usuario WHERE email = ? AND senha = ?";

    try (Connection conn = ConexaoBD.obtemConexao();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, usuario.getEmail());
        ps.setString(2, usuario.getSenha());

        try (ResultSet rs = ps.executeQuery()) {
            return rs.next();
        }
    }
}

public void salvar(String hospital, String horario, String data, String cpf) throws Exception {

        String sql = "INSERT INTO agendamento " + "(hospital, data_agendada, horario, cpf ) " + "VALUES (?, ?, ?, ?)";

        Connection conn =
                ConexaoBD.obtemConexao();

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, hospital);

        ps.setString(2, data);

        ps.setString(3, horario);
        
        ps.setString(4, cpf);

        ps.executeUpdate();
    }

public ResultSet buscar(String cpf) {

    Connection con =
            ConexaoBD.obtemConexao();

    String sql =
            "SELECT * FROM agendamento WHERE cpf = ?";

    try {

        PreparedStatement pst =
                con.prepareStatement(sql);

        pst.setString(1, cpf);

        return pst.executeQuery();

    } catch (Exception e) {

        e.printStackTrace();
        return null;
    }
}

public void excluir (String cpf) throws Exception{
       String sql = "DELETE FROM agendamento WHERE cpf =?";
      try (Connection conn = ConexaoBD.obtemConexao();
              PreparedStatement ps = conn.prepareStatement(sql)){
          ps.setString(1, cpf);
          ps.execute();

}
}
}
