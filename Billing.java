package ex1;
import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        boolean valid = false; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 'Name' and 'card' to pay:");
        String name=sc.nextLine();
        String cardText = sc.nextLine();
        int card = 0; 
        while(valid == false){
            if (cardText.length() == 8) {
                try {
                    card = Integer.parseInt(cardText) ;
                    valid = true;
                }
                catch (NumberFormatException excepcion) {
                    valid = false;
                }
            }
            if (valid == false ){  
            System.out.println("A card has 8 numbers");
            System.out.println("Enter your'card' to pay:");
            cardText = sc.nextLine();
            }
        }

        Customer customer1 = new Customer(name,  card);
        System.out.println(customer1);   // toString()

    }
}

class Customer {
    String nameCustomer; 
    int card; 

    Customer(String nameCustomer, int card)  {
        this.nameCustomer = nameCustomer; 
        this.card = card; 
    }


    public String toString() {
        return "Name of customer = " + this.nameCustomer + " and the card used = " +  this.card; 
    }


    private class Compra  {
        public int listaDeCompra(){
            boolean valid = false; 
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a product and its price:");
            String product=sc.nextLine();
            String priceText = sc.nextLine();
            int price = 0; 
            while(valid == false){
                try {
                    price = Integer.parseInt(priceText) ;
                    valid = true;
                }
                catch (NumberFormatException excepcion) {
                    valid = false;
                    }
                }
                if (valid == false ){  
                System.out.println("A price has numbers");
                System.out.println("Re submit the price");
                priceText = sc.nextLine();
                }
            }

            

        }
}
}



