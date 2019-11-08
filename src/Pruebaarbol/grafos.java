/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebaarbol;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author ccgja
 */
public class grafos {
    public List <String> letras = new ArrayList<>();
public static List <Nodo> nodes = new ArrayList<>();
public static List <aristas> ars = new ArrayList<>();
public static BufferedReader br = null;
public static final String QUOTE ="\"";
public static int count = 0;
public static void main(String [] args) throws IOException {
    br = new BufferedReader(new FileReader("/Users/ccgja/Desktop/ss/dds.csv"));
    String line = br.readLine();
    while (null!=line){
        String [] fields = line.split(",");

        fields = removeQuotes(fields);


        if(nodes.isEmpty()){
            addNodes(fields);

        }else{
            String[] aux = line.split(",");
            for (int i = 0;i<aux.length; i++){
                if(aux[i].equals("1")){
                    aristas ar = new aristas();
                    ar.nodo1 = nodes.get(count);
                    ar.nodo2 = nodes.get(i);
                    ars.add(ar);
                }
            }
            count+=1;
        }
        line = br.readLine();

    }
    for (int i = 0; i<ars.size(); i++){
        System.out.println(ars.get(i).toString());
    }
}
private static String [] removeQuotes(String[] fields){
    String [] result = new String[fields.length];
    for (int i = 0; i<result.length; i++){
        result[i] = fields[i].replaceAll(QUOTE," ").replaceAll(QUOTE+"$","");
    }
    return result;
}
private static void addNodes(String [] letras){
    for (int i = 0; i<letras.length; i++)   {
        Nodo n= new Nodo(letras[i]);
        nodes.add(n);
        System.out.println(nodes.get(i));
    }

}

}
