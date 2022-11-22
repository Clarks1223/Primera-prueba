import java.util.Scanner;
public class Metodos {
    /*Scanner permite cargar datos del teclado*/
    Scanner sc=new Scanner(System.in);
    /*Creacion del nuevo objeto*/
    Banco obj=new Banco();
    public void deposito(){
        /*calcula los depositos que ingrese el usuario,
        * captura el valor de saldos en el obejto
        * realiza la suma*/
        double auxcant, auxsaldo, auxtot;
        System.out.println("***DEPOSITO***");
        System.out.print("Ingrese la cantidad: ");
        auxcant=sc.nextDouble();
        while (auxcant<0){
            System.out.println("Dato erroneo");
            System.out.print("Ingrese otra cantidad: ");
            auxcant=sc.nextDouble();
        }
        auxsaldo=obj.getSaldo();
        auxtot=auxcant+auxsaldo;
        obj.setSaldo(auxtot);
        System.out.println("Proceso exitoso");
    }

    public void retiro(){
        /*calcula los retiros que ingrese el usuario,
         * captura el valor de saldos en el obejto
         * realiza la resta
         * controla que los valores sean correctos
         * */
        double auxcant, auxsaldo, auxtot;
        System.out.println("***DEPOSITO***");
        System.out.print("Ingrese la cantidad: ");
        auxcant=sc.nextDouble();
        auxsaldo=obj.getSaldo();
        while(auxcant>auxsaldo){
            System.out.println("El saldo de su cuenta es insuficiente");
            System.out.print("Ingrese otra cantidad: ");
            auxcant=sc.nextDouble();
        }
        auxtot=auxsaldo-auxcant;
        obj.setSaldo(auxtot);
    }

    public void mostar(){
        /*muestra la informacion del propietario de la cuenta*/
        System.out.println("***INF CUENTA***");
        System.out.println("Nombre: "+obj.getNombre());
        System.out.println("DNI: "+obj.getDNI());
        System.out.println("Saldo actual: "+obj.getSaldo());
    }
}
