package s3_cadenas_josueham;

import java.util.Scanner;

public class S3_cadenas_JosueHam {

 
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int opcion; 
       do{
           System.out.println(" ");
           System.out.println("Bienvenido al programa");
           System.out.println();
           System.out.println("1 -> Contar vocales");
           System.out.println("2 -> Comparacion de cadenas");
           System.out.println("3 -> Extraer palabras");
           System.out.println("4 -> Acumulador de letras");
           System.out.println("5 -> Alfanumerico");
           System.out.println("6 -> Ordenamiento de caracteres");
           System.out.println("7 -> Salir del programa");
           System.out.println("Ingrese que opcion desea: ");
           opcion = leer.nextInt();
           
           switch (opcion){
               case 1: {
                   String palabra, palabra_2;
                   System.out.println("Ingrese su palabra: ");
                   palabra = leer.next();
                   palabra_2 = palabra.toLowerCase();
                   System.out.println( palabra_2);
                   int cont = 0;
                   
                   for (int i = 0; i < palabra_2.length(); i++) {
                       char letra = palabra_2.charAt(i);
                       
                       switch (letra){
                           case 'a': 
                           case 'e':
                           case 'i':
                           case 'o':
                           case 'u': cont++;
                           break;
                       }//Fin Switch Ciclo For
                   }//Fin For Length
                   System.out.println("La palabra " + palabra + " tiene " + cont + " vocales");
               }//Fin case 1
               break;
               
               case 2: {
                   System.out.println("Ingrese la primera palabra: ");
                   String palabra_1 = leer.next().toLowerCase();
                   System.out.println("Ingrese la segunda palabra: ");
                   String palabra_2 = leer.next().toLowerCase();
                   
                   if (palabra_1.equals(palabra_2)){
                       System.out.println("Son iguales");
                   }//Fin if 
                   else {
                       System.out.println("No son iguales");
                   }//Fin else  
                  
                   
                   
               }//Fin case 2
               break;
               
               case 3: {
                   String palabra,otra;
                   System.out.println("Ingrese una palabra: ");
                   palabra = leer.next().toLowerCase();
                   
                   otra = palabra.substring(0,6 );
                   System.out.println(palabra + " / "+otra);
                   
               }//Fin case 3
               break;
               case 4: {
                   String palabra, acum = " ";
                   System.out.println("Ingrese una palabra: ");
                   palabra = leer.next().toLowerCase();
                   
                   for (int i = 0; i < palabra.length(); i++) {
                       acum+= palabra.charAt(i);
                       System.out.println(acum);
                       
                   }//Fin For Case 4
               }//Fin case 4
               break; 
               
               case 5: {
                   String alfanumerica, digito;
                   int numero = 0, cposicion = 1;
                   int c2 = 0; 
                   System.out.println("Ingrese una cadena alfanumerica: ");
                   alfanumerica = leer.next();
                   
                   for (int k = 0; k < alfanumerica.length(); k+= 2) {
                       char y = alfanumerica.charAt(k);
                       char x = alfanumerica.charAt(cposicion);
                       
                       digito =  Character.toString(y);
                       
                       numero = Integer.parseInt(digito);
                       
                       //System.out.print(y);
                        for (int j = 0; j < numero; j++) {
                            System.out.print(x);
                       }//fin for interno
                       cposicion+=2;
                   }//Fin for
                   System.out.println("");
               }//Fin case 5
               
               break; 
               
               case 6: {
                   String cadena1;
                   System.out.println("Ingrese su cadena: ");
                   cadena1 = leer.next();
                   
                   String cadenaLower;
                   cadenaLower = cadena1.toLowerCase();
                   String AcumOrden = " ";
                   
                   int numero = 0;
                   for (int i = 97; i <= 122; i++) {
                       for (int h = 0; h < cadenaLower.length(); h++) {
                           char lt = cadenaLower.charAt(h);
                           
                           if (i == (int)lt){
                            AcumOrden+=lt;
                       }//Fin If
                   }//Fin For h
                  }//Fin For i
                   System.out.println(AcumOrden);
               }//Fin case 6
               break;
               
               default:
                   System.out.println("Saliendo del programa...");
           }//Fin switch
       }while (opcion!=7);
    }//Fin del main 
    
}//Fin de la clase