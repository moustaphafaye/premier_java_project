package services;
import java.util.Scanner;
import models.Etudiant;
import models.Pavillon;
import models.TypeChambre;
import models.Chambre;


public class ServiceTableau implements IService{

    public final int NOMBRE = 10;

    private Chambre chambres[] = new Chambre[NOMBRE];
    private int indexChambre = 0;
    private Pavillon pavillons[]=new Pavillon[NOMBRE];

    @Override
    public void ajouterEtudiant(Etudiant etudiant) {
        
        
    }

    

    @Override
    public int getPositionPavillon(int id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void supprimerPavillon(int id) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void listerPavillon() {
       
        for (Pavillon pavillon : pavillons) {
            if(pavillon != null){
                System.out.println(pavillon);
            }
        }
    }

    @Override
    public void ajouterChambre(Chambre chambre) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer le nombre de chambre que vous voulez ajouter");
        int nombre = scanner.nextInt();
        Chambre chambre1 = new Chambre();
        Pavillon pavillon1 = new Pavillon();
        for(int i=1;i<=nombre;i++){ 
            System.out.println("saisie l' id du chambre:"+i);
            int id = scanner.nextInt();
            chambre1.setId(id);
            // System.out.println("saisie le Numero du chambre"+i);
            // int numero = scanner.nextInt();
             chambre1.setNumero("ch00"+i);
             System.out.println("saisie l'etages du chambre"+i);
             Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
             chambre1.setEtage("etage"+str);
             System.out.println("saisie le pavillon du chambre"+i);
             int idp = scanner.nextInt();
             pavillon1.setId(idp);
             chambre1.setPavillon(pavillon1);
             System.out.println("saisie le type du chambre");
             int type = scanner.nextInt();
              if(type!=1){
                  chambre1.setType(TypeChambre.INDIVIDUELLE) ; 
              }else{
                chambre1.setType(TypeChambre.DOUBLE) ;
              }
             chambres[i] = chambre1;
        }
        
    //    if(indexChambre < NOMBRE){
    //         chambres[indexChambre] = chambre;
    //         indexChambre++;
    //    }
    //    else{
    //         System.out.println("Le tableau est rempli");
    //    }
        
    }
    @Override
    public void ajouterPavillon(Pavillon pavillon) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer le nombre de Pavillon que vous voulez ajouter");
        int nombre = scanner.nextInt();
       Pavillon pavillon1 = new Pavillon();
        for(int i=1;i<=nombre;i++){ 
            System.out.println("saisie l' id du pavillon:"+i);
            int id = scanner.nextInt();
            pavillon1.setId(id);
            System.out.println("saisie le Numero du pavillon"+i);
            int numero = scanner.nextInt();
             pavillon1.setNumero(numero);
             System.out.println("saisie le nombre d'etages du pavillon"+i);
             int nbreetage = scanner.nextInt();
             pavillon1.setNbrEtages(nbreetage);
             pavillons[i] = pavillon1;
        }
        
        
    }

    @Override
    public void listerChambre() {
        
        for (Chambre chambre : chambres) {
            if(chambre != null){
                System.out.println(chambre);
            }
        }
        
    }
    
}
