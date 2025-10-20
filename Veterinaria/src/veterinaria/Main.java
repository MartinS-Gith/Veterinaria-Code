package veterinaria;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animales> animales = new ArrayList<>();
        int op = 0;
        int op2 = 0;
        
        do{
            System.out.println("seleccione opcion");
            System.out.println("1.- Ingresar Animal");
            System.out.println("2.- Mostrar los datos de un animal por código");
            System.out.println("3.- Mostrar cuantos animales domésticos y salvajes hay en el sistema");
            System.out.println("4.- Domesticos revisar vacunas, salvajes revisar peligrosidad");
            System.out.println("5.- Salir");
            
            op = sc.nextInt();
            sc.nextLine();
            if(op == 1){
                do{
                    System.out.println("el animal es 1.Domestico/ 2.-Salvaje /3.Volver al menú principal");
                    op2 = sc.nextInt();
                    sc.nextLine();
                    
                    if(op2 == 1){
                        System.out.println("ingrese el codigo del animal: ");
                        String codigo = sc.nextLine();
                        System.out.println("ingrese el nombre: ");
                        String nombre = sc.nextLine();
                        
                        System.out.println("ingrese el peso en Kilogramos: ");
                        int pesoKg = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.println("ingrese fecha de ingreso: ");
                        String fechaIngresoString = sc.nextLine();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                        LocalDate fechaIngreso = LocalDate.parse(fechaIngresoString, formatter);
                        
                        System.out.println("Ingrese la raza del animal: ");
                        String raza = sc.nextLine();
                        
                        System.out.println("ingrese especie del animal");
                        String especie = sc.nextLine();
                        
                        System.out.println("¿El animal está vacunado? [si/no]");
                        String estaVacunado = sc.nextLine();
                        Boolean vacunado = estaVacunado.equalsIgnoreCase("si");

                        animales.add(new Domesticos(codigo, nombre, pesoKg, fechaIngreso, raza, especie, vacunado));
                    }
                }while (op2 != 3);
            }else if(op == 2){
            System.out.println("lista de animales: "+ animales);
        } 
        }while (op != 5);
    }
    
}
