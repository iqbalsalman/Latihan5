package Latihan5.bin;

import java.util.Map;
import java.util.HashMap;

public class Latihan5{
  
    public static void main(String[] args){
    	 HashMap<String, String> mahasiswa = new HashMap<String, String>();

    	mahasiswa.put("001", "Muhamad Yusuf");
    	mahasiswa.put("002", "Dimas Maryanto");
    	mahasiswa.put("006", "Hari Sapto Adi");
    	mahasiswa.put("007", "Putri Harahap");


    	mahasiswa.put("008", "Dewa Nyoman Santosa");
        mahasiswa.put("009", "Hariaty");
           mahasiswa.put("010", "Karina Virgi");
    // System.out.println(
    //   String.format("Key dan Value",mahasiswa.get(001)
    //        )
    //     );
    System.out.println(" Key          Value ");
   
     System.out.println("001 " +mahasiswa.get("001")); 
     System.out.println("002 " +mahasiswa.get("002")); 
     System.out.println("006 " +mahasiswa.get("006")); 
     System.out.println("007 " +mahasiswa.get("007")); 
      System.out.println("008 " +mahasiswa.get("008")); 
      System.out.println("009 " +mahasiswa.get("009")); 
    System.out.println("010 " +mahasiswa.get("010")); 

    }
}