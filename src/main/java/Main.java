public class Main {
    public static void main(String[] args) {
        try {
            EntierNaturel entier = new EntierNaturel(5);
            System.out.println("Valeur initiale: " + entier.getVal());

            entier.setVal(10);
            System.out.println("Valeur après setVal: " + entier.getVal());


            entier.decrementer();
            System.out.println("Valeur après decrementer: " + entier.getVal());


            entier.setVal(-1);
        } catch (NombreNegatifException e) {
            System.out.println("Erreur: " + e.getMessage());
            System.out.println("Valeur erronée: " + e.getValeurErronee());
        }

        try {

            EntierNaturel entierNegatif = new EntierNaturel(-3);
        } catch (NombreNegatifException e) {
            System.out.println("Erreur: " + e.getMessage());
            System.out.println("Valeur erronée: " + e.getValeurErronee());
        }

        try {
            EntierNaturel entier = new EntierNaturel(0);
            entier.decrementer();
        } catch (NombreNegatifException e) {
            System.out.println("Erreur: " + e.getMessage());
            System.out.println("Valeur erronée: " + e.getValeurErronee());
        }
    }
}