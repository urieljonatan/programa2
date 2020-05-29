/*
 * Realizar la suma de todos los numeros de un solo digito que se puedan extraer de un numero, 
 * la suma ahora sera el numero a abstraer en caso de que no sea de un digito, hacer hasta que se logre tener un numero de un digito
 * @28/5/20
 */
package codigo2;
import javax.swing.*;
/**
 *
 * @author Uriel Solano
 */
public class Codigo2 {
    public static void calculoChido(String calcular){//Inicio del metodo
        boolean bandera=false;//Asignado el valor del booleano
        String calcular2=calcular;//Asignar a la cadena calcular2 el valor de calcular
        while(bandera!=true){//Inicio del while
            String xd="La suma de ";//Asignar el valor de la cadena xd
            int calculada=0;//Variable de tipo entero con valor de 0
            for(int i=0;i<=calcular2.length()-1;i++){//Inicio del for
            xd=xd+(calcular2.charAt(i)+"+");//Asignar a xd su valor mas la posicion de i en cancular2 mas el signo +
            calculada=calculada+(Integer.parseInt(String.valueOf(calcular2.charAt(i))));//Asignar a calculada su valor mas el valor entero de la posicion de la cadena
            }
            xd=xd+("0=");//Asignar a xd su valor mas 0=
            if(calculada<=9){//Inicio del if
               System.out.println(xd+calculada);//Imprimir el valor de xd mas calculada
               bandera=true;//Asignar a bandera verdadero
               }else{//Inicio del else
               System.out.println(xd+calculada+" Excede a 10, calculando de nuevo");//Imprimir xd+calculada+un texto
               calcular2=String.valueOf(calculada);//Asignar a calcular2 el valor de calculada convirtiendolo a cadena
               }
        }//Fin del while
    } //Fin del metodo
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Inicio del main
        // TODO code application logic here
        String numero=JOptionPane.showInputDialog(null,"Ingresa el numero a leer");//Solicitando un numero
        calculoChido(numero);//Mandar a llamar el metodo
    }//Fin del main
    
}//Fin de la clase
