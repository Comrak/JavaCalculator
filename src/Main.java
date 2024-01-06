import Menu.MenuPrincipal;

import java.util.Objects;

public class Main {
    public static void main(String[] args){
        String resultado = "";
        MenuPrincipal menu = new MenuPrincipal();
        System.out.println(menu.greet);
        while (!Objects.equals(resultado, "close program")){
            resultado = menu.solicitarSelecion();
            if(!Objects.equals(resultado, "close program")){
                System.out.println(resultado);
            }
        }
        System.out.println(menu.farewell);
    }
}
