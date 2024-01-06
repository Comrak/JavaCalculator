package Menu;
import Operaciones.*;

import java.util.*;

public class MenuPrincipal {
    public String greet;
    {
        greet = "Bienvenido a MateMenu 3000";
    }
    public String farewell;
    {
        farewell = "Gracias hasta luego";
    }
    List<String> Operaciones = Arrays.asList(
            "SUMA",
            "RESTA",
            "MULTIPLICACION",
            "DIVISION",
            "SALIR");

    public String solicitarSelecion(){
        boolean repeat = true;
        int number1 = 0;
        int number2 = 0;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese el nombre de la operacion matematica que desea realizar \n(ejemplo: suma,resta,division,multiplicacion) o escriba salir para terminar el programa: ");
        String operacion = myObj.nextLine();
        if(Operaciones.contains(operacion.toUpperCase())){
            if(operacion.equalsIgnoreCase("SALIR")){
                return  operacion(operacion,number1,number2);
            }
            while(repeat)
            {
                System.out.println("Ingrese el primer numero: ");
                String num1String = myObj.nextLine();
                try{
                    number1 = Integer.parseInt(num1String);
                    repeat = false;
                }catch (NumberFormatException e) {
                    System.out.println("Eso no me parece un numero valido intenta de nuevo");
                }
            }
            repeat = true;
            while(repeat)
            {
                System.out.println("Ingrese el segundo numero: ");
                String num2String = myObj.nextLine();
                try{
                    number2 = Integer.parseInt(num2String);
                    repeat = false;
                }catch (NumberFormatException e) {
                    System.out.println("Eso no me parece un numero valido intenta de nuevo");
                }
            }
        }else {
            return "Perdon no entendi tu seleccion";
        }
        return  operacion(operacion,number1,number2);
    }

    public String operacion(String operacion, int num1, int num2){
        switch (operacion.toUpperCase(Locale.ROOT)) {
            case "SUMA" -> {
                Suma ope = new Suma(num1, num2);
                return String.format("El resultado de la %s de %s y %s es %s",operacion.toLowerCase(), num1, num2, ope.OperacionSimple());
            }
            case "RESTA" -> {
                Resta ope = new Resta(num1, num2);
                return String.format("El resultado de la %s de %s y %s es %s",operacion.toLowerCase(), num1, num2, ope.OperacionSimple());
            }
            case "MULTIPLICACION" -> {
                Multiplicacion ope = new Multiplicacion(num1, num2);
                return String.format("El resultado de la %s de %s y %s es %s",operacion.toLowerCase(), num1, num2, ope.OperacionSimple());
            }
            case "DIVISION" -> {
                Division ope = new Division(num1, num2);
                return String.format("El resultado de la %s de %s y %s es %s",operacion.toLowerCase(), num1, num2, ope.OperacionSimple());
            }
            case "SALIR" ->{
                return "close program";
            }
            default -> {
                return "Perdon no entendi tu seleccion";
            }
        }
    }

}
