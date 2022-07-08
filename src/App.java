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
            default:
                System.out.println("Choix incorrect");
                break;
        }

        

    }
}
