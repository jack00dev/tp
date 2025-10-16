import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mixx_ussd = "*145#";
        String ussd;
        
        do {
            System.out.print("Saisir le code mixx by Yas : ");
            ussd = scanner.nextLine();
        } while (!ussd.equals(mixx_ussd));

        System.out.println("1- Transfert d'argent");
        System.out.println("2- Retrait d'argent");
        System.out.println("3- Achat de Crédit/forfait");
        System.out.println("4- Paiement de facture");
        System.out.println("5- Paiement marchand");
        System.out.println("6- Services financiers");
        System.out.println("7- Mon compte");
        System.out.println("8- Selfcare");

        System.out.println("Sélectionnez une option (0 pour quitter)");

        Scanner scanner1 = new Scanner(System.in);

        int choice = scanner1.nextInt();

        while (choice != 0 && choice < 1 || choice > 8) {
            System.out.println("Sélectionnez une option et 0 pour quitter");
            choice = scanner1.nextInt();
        }

        switch (choice){
            case 0:
                System.out.println("Bye bye");
                break;
            default:
                System.out.println("Invalide");
                break;
            case 1:
                System.out.println("Service temporairement indisponible");
                break;
            case 2:
                System.out.println("Service temporairement indisponible");
                break;
            case 3:
                System.out.println("Service temporairement indisponible");
                break;
            case 4:
                System.out.println("Service temporairement indisponible");
                break;
            case 5:
                System.out.println("Service temporairement indisponible");
                break;
            case 6:
                System.out.println("Service temporairement indisponible");
                break;
            case 7:
                System.out.println("1. Solde");
                System.out.println("2. Dernieres transactions");
                System.out.println("3. Identite");
                System.out.println("4. Gerer mon compte");
                System.out.println("5. Solde Promo");

                System.out.println("Sélectionnez une option et 0 pour quitter");

                Scanner scanner2 = new Scanner(System.in);

                int option = scanner2.nextInt();

                while (option != 0 && option < 1 || option > 5 ) {
                    System.out.println("Sélectionnez une option et 0 pour quitter");
                    option = scanner2.nextInt();
                }
                    switch (option) {
                        case 0:
                            System.out.println("Bye bye");
                            break;
                        default:
                            System.out.println("Invalide");
                            break;
                        case 1:
                            Scanner scanner3 = new Scanner(System.in);
                            int pass = 1598;
                            int motPass;
                            boolean correct;
                            correct = false;

                            while (correct == false) {
                                System.out.print("Entrer votre code secret: ");
                                motPass = scanner3.nextInt();

                                if (pass == motPass) {
                                    System.out.println("Le solde de votre compte mixx by Yas est 900 000 000 000 Fcfa le 07/05/2025; Ref: 156262146552652");
                                    break;
                                }
                                else {
                                    System.out.println("Code secret incorrect, réessayer");
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Service temporairement indisponible");
                            break;
                        case 3:
                            System.out.println("Service temporairement indisponible");
                            break;
                        case 4:
                            System.out.println("Service temporairement indisponible");
                            break;
                        case 5:
                            System.out.println("Service temporairement indisponible");
                            break;
                    }
                break;
            case 8:
                System.out.println("Service temporairement indisponible");
                break;
        }
    }
}