import java.util.Scanner;
public class Main {
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        Metodos met=new Metodos();
        int menu=1;
        while (menu!=0){
            menu=menu();
            switch(menu){
                case 1:
                    met.deposito();
                    break;
                case 2:
                    met.retiro();
                    break;
                case 3:
                    met.mostar();
                    break;
            }
        }
        System.out.println("Adios, regrese pronto");
    }
    static int menu(){
        int op;
        /*muestra las opciones del menu
        * controla datos correctos
        * */
        System.out.println("Menu del cajero automatico");
        System.out.println("1. Deposito");
        System.out.println("2. Retiros");
        System.out.println("3. Ver saldo actual");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
        op=sc.nextInt();
        while (op!=1 && op!=2 && op!=3 && op!=0){
            System.out.println("Dato incorrecto");
            System.out.print("Opcion: ");
            op=sc.nextInt();
        }
        return op;
    }
}