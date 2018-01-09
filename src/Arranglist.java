package Latihan5.bin;

import java.util.List;
import java.util.ArrayList;
public class Arranglist{ 
	public static void main(String[] args){
	List<Integer> values = new ArrayList();

	values.add(1 );
	values.add(2 );
	values.add(3 );
	values.add(4 );
	values.add(5 );
	values.add(6 );
	values.add(7 );
	values.add(8 );
	values.add(9 );
	values.add(10);
// 	Integer[]values = {1,3,5,10,1,20,10,1,20,9,1 };
// for(int i=0; i< values.length; i++){
//            	System.out.print(values[i]+", ");
//            }
	  Integer [] persertaBootcamp = {
            1,
            3,
            5,
            10,1,20,10,1,20,9,1
        };
        System.out.println(String.format("Peserta bootcamp index ke 2 adalah "+ persertaBootcamp[2]));
           for(int i=0; i< persertaBootcamp.length; i++){
           	System.out.print(persertaBootcamp[i]+", ");
           }

for(int i = 0; i < values.size(); i++){
            System.out.print(values.get(i));
 
     }

}
	
}