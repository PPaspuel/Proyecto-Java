package basicos.PruebaGit;

public class NuevoP {
    public static void main(String args[]){
    int Arreglo [] = new int [6];
    
    // Datos para el arreglo
    Arreglo [0] = 10;
    Arreglo [1] = 25;
    Arreglo [2] = 30;
    Arreglo [3] = 19;
    Arreglo [4] = 20;
    Arreglo [5] = 50;
    
   for(int i =0;i<Arreglo.length;i++){
    System.out.print(i+1);
    System.out.println("\tNumeros ingresados:"+" "+ Arreglo[i]*2);
   }
   
}
}
