package program2;

public class mahasiswa 
extends manusia{
private double hasil;
     
void datamahasiswa(String NIM, String Fakultas, String Jurusan){ 
    System.out.println("NIM : "+NIM); 
    System.out.println("Fakultas : "+Fakultas); 
    System.out.println("Jurusan : "+Jurusan);
}        
void nilaimahasiswa(double Tugas1, double Tugas2, double Tugas3, double UTS, double UAS){ 
    hasil = ((Tugas1+Tugas2+Tugas3)/3)*0.4+UTS*0.3+UAS*0.3; 
    System.out.println("Nilai Akhir : " +hasil);
}
}