package Latihan5.bin;

import java.util.Set;
import java.util.HashSet;
public class Arranglist{ 
    public static void main(String[] args){
    Set<Integer> index = new HashSet<>();
    index.add(0);
    index.add(1);       
    index.add(2);
    index.add(3);
    index.add(4);
    index.add(5);
    index.add(6);
    index.add(7);
    index.add(8);
    index.add(9);
    index.add(10);
    index.add(1);
    index.add(3);
    index.add(5);
    index.add(10);
    index.add(1);
    index.add(20);
    index.add(10);
    index.add(1);
    index.add(20);
    index.add(9);
    index.add(1);

           Object [] arrFromSet = index.toArray(); 
           for(int i = 0; i < arrFromSet.length; i++){
                System.out.print(arrFromSet[i]+",");
            }
            System.out.println();
            System.out.println(" Index ke "+arrFromSet[0]+" adalah "+arrFromSet[1]+" index ke "+arrFromSet[1]+" adalah "+arrFromSet[3]+ " dan index ke "+arrFromSet[3]+" adalah "+arrFromSet[11]);
               
        }
}