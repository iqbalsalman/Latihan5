package Latihan5.bin;

import java.util.Map;
import java.util.HashMap;

public class LatihanAngka{


public static void main(String[] args){
HashMap<String, String> mahasiswa = new HashMap<String, String>();
	    mahasiswa.put("001", "Muhamad Yusuf");
    	mahasiswa.put("002", "Dimas Maryanto");
    	mahasiswa.put("006", "Hari Sapto Adi");
    	mahasiswa.put("007", "Putri Harahap");
    	mahasiswa.put("008", "Dewa Nyoman Santosa");
        mahasiswa.put("009", "Hariaty");
        mahasiswa.put("010", "Karina Virgi");
      

       
        System.out.println("Nama Saya"+mahasiswa.get("010")+"Nip saya 010"
        );

     }

  }