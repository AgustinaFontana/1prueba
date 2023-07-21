import java.util.Scanner;  // Import the Scanner class


class Main {
    public static void main(String[] args) {
        Gato michi1 = new Gato();

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Ingrese nombre de gato: ");
        String nombre = myObj.nextLine();  // Read user input
        michi1.name = nombre;
        
        System.out.println("Te presento a " + michi1.name);
        // Calling the method on hero1
        michi1.foto();

        Pato pati1 = new Pato();

        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Ingrese nombre de pato: ");
        String nombre2 = myObj2.nextLine();  // Read user input
        pati1.name = nombre2;
        
        System.out.println("Te presento a " + pati1.name);
        // Calling the method on hero1
        pati1.foto();

        Caracol cari1 = new Caracol();

        Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Ingrese nombre de caracol: ");
        String nombre3 = myObj3.nextLine();  // Read user input
        cari1.name = nombre3;
        
        System.out.println("Te presento a " + cari1.name);
        // Calling the method on hero1
        cari1.foto();

    }
}

class Gato {
    String name;

    void foto() {
        System.out.println("_____$$_____$$"+
        "\n_____$$$___$$$"+
        "\n_____$$$$$$$$$_______$$"+
        "\n______$$$$$$$_______$$$"+
        "\n_______$$$$$________$$$$"+
        "\n________$$$__________$$$$"+
        "\n________$$$$__________$$$"+
        "\n________$$$$$$$______$$$"+
        "\n________$$$$$$$$____$$$"+
        "\n_________$$$$$$$____$$"+
        "\n__________$$$$$$___$$"+
        "\n__________$$$$$_$__$$"+
        "\n__________$$$$_$$$_$$"+
        "\n__________$$$_$$$$$_$$"+
        "\n_________$$$__$$$$_$$");
    }
}




class Pato {
    String name;

    void foto() {
        System.out.println("____$$$_____"+
        "\n___$___$___"+
        "\n_$$_o___$__"+
        "\n$$$_____$___"+
        "\n_$$_____$__"+
        "\n___$____$$$$$"+
        "\n____$$______$__"+
        "\n____$__$__$_$__"+
        "\n____$___$$_$__"+
        "\n____$______$__"+
        "\n_____$____$___"+
        "\n______$$$$____"+
        "\n_____$____$____");
    }
}



class Caracol {
    String name;
    
    void foto() {
        System.out.println("______$$$$$$$_____$____$ "+
        "\n_____$_______$_____$___$ "+
        "\n____$__$$$$$__$____$___$ "+
        "\n___$__$_____$__$___$__$ "+
        "\n___$_$__$$$__$_$____$$ "+
        "\n___$_$_$___$_$_$__$$$$$ "+
        "\n___$_$_$_$_$_$_$_$_____$ "+
        "\n___$_$_$__$__$_$_$___$_$ "+
        "\n___$_$__$___$__$_$_$___$ "+
        "\n___$__$__$$$__$__$__$__$ "+
        "\n____$__$_____$__$____$_$ "+
        "\n_____$__$$$$$__$______$ "+
        "\n____$_$_______$______$ " + 
        "\n___$___$$$$$$$______$  "+
        "\n__$________________$ "+
        "\n_$________________$  ");

    }
}


