/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zacky180423;

/**
 *
 * @author TUF GAMING
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord annaRecord = new StudentRecord();
        StudentRecord aliRecord = new StudentRecord();
        annaRecord.setName ("Anna");
        annaRecord.setAddress("Padang");
        annaRecord.setAge(23);
        annaRecord.setMathGrade(80);
        annaRecord.setEnglishGrade(70);
        annaRecord.setScienceGrade(80);
        
        aliRecord.setName ("Ali");
        aliRecord.setAddress("Padang");
        aliRecord.setAge(23);
        aliRecord.setMathGrade(80);
        aliRecord.setEnglishGrade(70);
        aliRecord.setScienceGrade(80);
        ///
        ///tampilkan data anna
        System.out.println("Nama        : "+annaRecord.getName());
        System.out.println("Alamat      : "+annaRecord.getAddress());
        System.out.println("Umur        : "+annaRecord.getAge());
        System.out.println("Matematika  : "+annaRecord.getMathGrade());
        System.out.println("B. Inggris  : "+annaRecord.getEnglishGrade());
        System.out.println("Pengetahuan : "+annaRecord.getScienceGrade());
        System.out.println("Rata rata   : "+annaRecord.getAverage());
        ///
        ///menampilka data ali
        System.out.println(" ");
        System.out.println("Nama        : "+aliRecord.getName());
        System.out.println("Alamat      : "+aliRecord.getAddress());
        System.out.println("Umur        : "+aliRecord.getAge());
        System.out.println("Matematika  : "+aliRecord.getMathGrade());
        System.out.println("B. Inggris  : "+aliRecord.getEnglishGrade());
        System.out.println("Pengetahuan : "+aliRecord.getScienceGrade());
        System.out.println("Rata rata   : "+aliRecord.getAverage());
        
        aliRecord.setName("ali");
        aliRecord.setAddress("padang");
        aliRecord.print("");
        aliRecord.print(80,70,80);
        
        StudentRecord budi = new StudentRecord("Budi","Padang");
        budi.print("");
        budi.print(80,70,80);
        
        
        System.out.println("jumlah siswa : "+StudentRecord.getStudentCount());
    }

    
}
