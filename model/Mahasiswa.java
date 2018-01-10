package Latihan5.bin;

import Latihan5.model.kelas;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Mahasiswa extends Kelas {
	private String nim, nama;
	private LocalDate tanggalLahir;
	private Integer angkatan;
	private Kelas kelas;

	// List<String> mahasiswa = new ArrayList<>();

	public String getNim(){

		return nim;

	}
	public void setNim(String nim){

		this.nim=nim;

	}
	public String getNama(){

		return nama;

	}
	public void setNama(String nama){

        this.nama=nama; 

	}
	public LocalDate getTanggalLahir(){

		return tanggalLahir;

	}
	public void setTanggalLahir(LocalDate tanggalLahir){

		this.tanggalLihar=tanggalLahir;

	}
	public Integer getAngkatan(){

		return angkatan;

	}
	public Kelas getKelas(){

		return kelas;

	}
	public void setKelas(Kelas kelas){

		this.kelas=kelas;

	}

	public Integer getAngkatan(){

		return angkatan;

	}

	public void setAngkatan(Integer angkatan ){

		this.angkatan=angkatan;

	}

	public void  toString(){

	List<String> mahasiswa = new ArrayList<>();
	setNama(mahasiswa.add("Dimas Maryanto"),
		mahasiswa.add("Muhamad Yusuf"), 
		mahasiswa.add("Adib"),
		mahasiswa.add("Hari Sapto"),
		mahasiswa.add("Harianty")
		);
	setNim(mahasiswa.add("10511148"),
		mahasiswa.add("10511150"),
		mahasiswa.add("10511170"),
		mahasiswa.add("10511160"),
		mahasiswa.add("1051110"));
	setKelas(mahasiswa.add("IF"),
		mahasiswa.add("IF"),
		mahasiswa.add("IF"),
		mahasiswa.add("IF"),
		mahasiswa.add("IF")
		);
	setTanggalLahir(mahasiswa.add(LocalDate.of(1992, Month.MARCH, 11)),
		// mahasiswa.add(LocalDate.of(1994, Month.MARCH, 11)),
        mahasiswa.add(LocalDate.of(1995, Month.JANUARY,20)),
        mahasiswa.add(LocalDate.of(1995, Month.FEBRUARY,12)),
        mahasiswa.add(LocalDate.of(1991, Month.MARCH,15)),
        mahasiswa.add(LocalDate.of(1992, Month.APRIL,6))

		);
	setAngka(mahasiswa.add(2014),
	       	mahasiswa.add(2014),
	       	mahasiswa.add(2014),
	       	mahasiswa.add(2014),
	       	mahasiswa.add(2014)
		);
	System.out.println(getNim+" "+getNama+" "+getTanggalLahir+" "+getAngkatan+" "+getKelas);

	}


}