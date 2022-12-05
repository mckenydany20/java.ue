import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProduitDataAcess {
    /*
     * se connecter a la base de donnee
     * chaine de connexion
     * nom de la base de donnes
     * nom d'utilisateur
     * mot de passe
     * */
    String db="magasin_db";
    String user="root";
    String password="";
    String url="jdbc:mysql://localhost:3306/"+db;
    Connection connection=null;
    public ProduitDataAcess() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("connected...");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    List<Produits> getAll(){
        List<Produits> list=new ArrayList<>();
        PreparedStatement pst=null;
        ResultSet rs;
        //ecrire une requete
        //executer une requete
        //remplir list
        String sql="select *from Produits";
        try {
            pst = connection.prepareStatement(sql);
            System.out.println("succes d'execution de la requete");
            rs=pst.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt(1) + "-" + rs.getString(2));
                list.add(new Produits(rs.getInt("id"), rs.getString("designation"),rs.getInt("qte"),rs.getDouble("prix"), rs.getDate("date").toLocalDate()));
            }
        }catch (SQLException exp){
            System.out.println(exp.getMessage());
        }

        return list;
    }
}
