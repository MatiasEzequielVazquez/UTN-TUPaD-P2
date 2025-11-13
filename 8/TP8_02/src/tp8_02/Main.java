package tp8_02;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\nEJERCICIOS");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            System.out.println("0 para salir");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("\nEJERCICIO 1");
                    DivisionSegura(scanner);
                    break;
                case 2:
                    System.out.println("\nEJERCICIO 2");
                    ConversionCadena(scanner);
                    break;
                case 3:
                    System.out.println("\nEJERCICIO 3");
                    LecturaArchivo();
                    break;
                case 4:
                    System.out.println("\nEJERCICIO 4");
                    ExcepcionPersonalizada(scanner);
                    break;
                case 5:
                    System.out.println("\nEJERCICIO 5");
                    TryWithResources();
                    break;
                case 0:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Incorrecto.");
            }
            
        } while (opcion != 0);
        
        scanner.close();
    }
    
    // Ejercicio 1
    public static void DivisionSegura(Scanner scanner) {
        try {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = scanner.nextInt();
            
            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();
            
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
    
    // Ejercicio 2
    public static void ConversionCadena(Scanner scanner) {
        try {
            scanner.nextLine();
            System.out.print("Ingrese un número: ");
            String texto = scanner.nextLine();
            
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: El texto ingresado no es un número válido.");
        }
    }
    
    // Ejercicio 3
    public static void LecturaArchivo() {
        String rutaArchivo = "archivo.txt";
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            
            System.out.println("Contenido del archivo:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo '" + rutaArchivo + "' no existe.");
            System.out.println("Cree un archivo llamado 'archivo.txt' en la raíz del proyecto.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo.");
                }
            }
        }
    }
    
    // Ejercicio 4
    public static void ExcepcionPersonalizada(Scanner scanner) {
        try {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            validarEdad(edad);
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad entre 0 y 120.");
        }
    }
    
    
    
    // Ejercicio 5
    public static void TryWithResources() {
        String rutaArchivo = "archivo.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            System.out.println("Contenido del archivo (try-with-resources):");
            
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Cree un archivo llamado 'archivo.txt' en la raíz del proyecto.");
        }
        
        System.out.println("Archivo cerrado automáticamente.");
    }
}
