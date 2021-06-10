import java.util.*;
public class Ejercicio2{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		int n1,nd;
		System.out.print("Ingrese numero: ");
		n1=scanner.nextInt();
        nd=n1;
		for (int i=0;i<n1;i++){
            System.out.print(" "+nd);
            nd--;
		}
	}
}