import java.util.List;

public class Progamme {
    public static void main(String[] args) {
        ProduitDataAcess PrdtDataAcess=new ProduitDataAcess();
        List<Produits> list=PrdtDataAcess.getAll();
        for(Produits p:list){
            System.out.println(p);
        }
    }
}
