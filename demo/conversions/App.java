package conversions;

public class App 
{

    public static void main(String[] args) 
    {
        String valeurAConvertir;
        
        int entier32bits;

        long entier64bits;
        
        float flottant32bits;

        double flottant64bits;

        valeurAConvertir = "42";

        entier32bits = Integer.parseInt(valeurAConvertir); // conversion d'un String vers un entier 32bits

        entier64bits = Long.parseLong(valeurAConvertir);  // conversion d'un String vers un entier 64bits

        valeurAConvertir = "13.37";

        flottant32bits = Float.parseFloat(valeurAConvertir);  // conversion d'un String vers un flottant 32bits

        flottant64bits = Double.parseDouble(valeurAConvertir);  // conversion d'un String vers un flottant 32bits

        System.out.println("Valeur originale : " + valeurAConvertir);
        System.out.println("Valeur convertie en entier 32 bits : " + entier32bits);
        System.out.println("Valeur convertie en entier 64 bits : " + entier64bits);
        System.out.println("Valeur convertie en flottant 32 bits : " + flottant32bits);
        System.out.println("Valeur convertie en flottant 64 bits : " + flottant64bits);

    }
    
}
