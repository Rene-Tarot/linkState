import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class LinkState{

	private static char intToChar(int i){
        switch (i) {
            case 0:
                return 'a';
                break;
            case 1:
                return 'b';
                break;
            case 2:
                return 'c';
                break;
            case 3:
                return 'd';
                break;
            case 4:
                return 'e';
                break;
            case 5:
                return 'f';
                break;
            case 6:
                return 'g';
                break;
        }
    }

    public static void main(String[] args) {
		boolean DEBUG = false;
        File file = new File("nodos.txt");//Archivo
        Queue<Character> nPrime = new LinkedList<Character>();// N'
       
        int[] finalInt = new int[7];//Array final solo int
        String[] finalString = new String[7];//array final para imprimir

        try{
            Scanner sc = new Scanner(file);
            int graph[][]= new int [7][7];

            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    graph[i][j] = sc.nextInt();
                }
            }

            // N' = {u}
            nPrime.add('e');

            /* Para todos los nodos v
                    Si v es un vecino de u
                        Entonces D(v) = c(u,v)
                    de otro modo D(v) = infinito */
            for (int i = 0; i<7; i++) {
                if (graph[4][i] == 0) {
                    finalInt[i] = -1;
                    finalString[i] = "-1,e";
                }else{
                    finalInt[i] = graph[4][i];
                    finalString[i] = graph[4][i] + ",e";
                }
            }

            if(DEBUG){
                for (int i=0; i<7; i++) {
                    System.out.println(finalString[i]);
                }    
            }

			            

            sc.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
	}
}