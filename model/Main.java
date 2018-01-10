// package Latihan5.bin;
package Latihan5.model;


import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Month;

public class Main{
	public static void main(String[] args){
	List<Mahasiswa> mahasiswa = new ArrayList<>();
	Kelas IF = new Kelas("IF",2014, "Informatika");
	Kelas SI = new Kelas("SI",2014, "Sistem informasi");
     mahasiswa.add( new Mahasiswa ("10511148",
     	                            "Dimas Maryanto",
     	                            LocalDate.of(1992, Month.MARCH, 11),
     	                            2014,
     	                            IF

     	));
      mahasiswa.add( new Mahasiswa ("10511148",
     	                            "Muhamad Yusuf",
     	                            LocalDate.of(1992, Month.MARCH, 11),
     	                            2014,
     	                            IF

     	));
       mahasiswa.add( new Mahasiswa ("10511148",
     	                            "Adib",
     	                            LocalDate.of(1992, Month.MARCH, 11),
     	                            2014,
     	                            IF

     	));
        mahasiswa.add( new Mahasiswa ("10511148",
     	                            "Muhamad Yusuf",
     	                            LocalDate.of(1992, Month.MARCH, 11),
     	                            2014,
     	                            IF

     	));
     	 mahasiswa.add( new Mahasiswa ("10511148",
     	                            "Muhamad Yusuf",
     	                            LocalDate.of(1992, Month.MARCH, 11),
     	                            2014,
     	                            IF

     	));
     	 mahasiswa.forEach((m)->{
         System.out.println(m.toString());
     	 });


  //   mahasiswa.add(""),
		// , 
		// mahasiswa.add(""),
		// mahasiswa.add("Hari Sapto"),
		// mahasiswa.add("Harianty");
	 //    mahasiswa.add(""),
		// mahasiswa.add(""),
		// mahasiswa.add("10511170"),
		// mahasiswa.add("10511160"),
		// mahasiswa.add("1051110");
	 //    mahasiswa.add("IF"),
		// mahasiswa.add("IF"),
		// mahasiswa.add("IF"),
		// mahasiswa.add("IF"),
		// mahasiswa.add("IF");
	 //    mahasiswa.addocalDate.of(1992, Month.MARCH, 11)(L),
		// // mahasiswa.add(LocalDate.of(1994, Month.MARCH, 11)),
  //       mahasiswa.add(LocalDate.of(1995, Month.JANUARY,20)),
  //       mahasiswa.add(LocalDate.of(1995, Month.FEBRUARY,12)),
  //       mahasiswa.add(LocalDate.of(1991, Month.MARCH,15)),
  //       mahasiswa.add(LocalDate.of(1992, Month.APRIL,6)

		// );
	 //        mahasiswa.add(2014),
	 //       	mahasiswa.add(2014),
	 //       	mahasiswa.add(2014),
	 //       	mahasiswa.add(2014),
	 //       	mahasiswa.add(2014);


	}
}