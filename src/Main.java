import Menus.MenuPrincipal;

import java.awt.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        MenuPrincipal menuPrincipal= new MenuPrincipal();
        menuPrincipal.iniciarMenu(teclado);
    }
}