import java.util.Scanner;

import models.Chambre;
import models.Pavillon;
import models.TypeChambre;
import services.IService;
import services.ServiceTableau;

public class App {


    
    public static void main(String[] args) throws Exception {
        
       System.out.println("Bienvenue à l'universite");
       System.out.println("");
       System.out.println("1:Ajouter Pavillon");
       System.out.println("2:Lister Pavillon");
       System.out.println("3:Ajouter Chambre:");
       System.out.println("4:Ajouter Etudiant:");
       System.out.println("5:Quitter:");
       System.out.println("");
      
        
       IService service = new ServiceTableau();
    //    Pavillon pavillon = new Pavillon();
    //    Pavillon pavillon = new Pavillon();
        Chambre chambre = new Chambre();
       Pavillon pavillon = new Pavillon();
    
      Scanner scanner = new Scanner(System.in);
      System.out.println("Faire votre choix");
        int nombre = scanner.nextInt();

        switch(nombre){

            case 1:
            service.ajouterPavillon(pavillon);
            service.listerPavillon();
                break;
            case 2:
            service.ajouterChambre(chambre);
            service.listerChambre();
                break;
            case 3:
            service.ajouterChambre(chambre);
            break;
            case 4:
                break;
        }

    

        // pavillon.setId(1);
        // pavillon.setNumero(2);
        // pavillon.setNbrEtages(4);
        // service.ajouterPavillon(pavillon);
        // service.listerPavillon();

        // IService service = new ServiceTableau();
        // Chambre chambre1 = new Chambre();

        
        


        //chambre.setId(1);
        
        // chambre.setNumero("ch001");
        // chambre.setEtage("2");
        // chambre.setType(TypeChambre.DOUBLE);
        // chambre.setPavillon(pavillon);

        // chambre1.setId(2);
        // chambre1.setNumero("ch002");
        // chambre1.setEtage("2");
        // chambre1.setType(TypeChambre.DOUBLE);
        // chambre1.setPavillon(pavillon);

        // service.ajouterChambre(chambre1);
        // service.listerChambre();
        

    }
}
