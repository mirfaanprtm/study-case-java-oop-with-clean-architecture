package challenge.service;

import challenge.entity.Mahasiswa;
import challenge.repository.MahasiswaRepository;

import java.util.Scanner;

public class Validation{

    protected Mahasiswa mahasiswa;

    MahasiswaRepository mahasiswaRepository = new MahasiswaRepository();

    public Validation() {
        this.mahasiswa = mahasiswa;
    }

    public void validAll(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("MAIN MENU");
        System.out.println("--------------");
        System.out.println("1. Add Mahasiswa");
        System.out.println("2. Delete Mahasiswa");
        System.out.println("3. View Mahasiswa");
        System.out.println("4. Exit");
        System.out.print("Masukkan Pilihan Anda : ");
        String menu = scanner.nextLine();

        while (true){
            if(menu.equals("1")){
                System.out.println("====ADD MAHASISWA====");
                System.out.print("Nama (3-20 Karakter) : ");
                String inputName = scanner.nextLine();
                    if(inputName.length() <= 20 && inputName.length() >= 3){
                        System.out.println("Nama Valid");
                    } else {
                        System.out.println("Nama tidak valid");
                        System.out.println("Silahkan input ulang");
                        validAll();
                    }

                    System.out.print("Jurusan (max 10 karakter) : ");
                    String inputJurusan = scanner.nextLine();
                    if(inputJurusan.length() <= 10){
                        System.out.println("Jurusan valid");
                    } else {
                        System.out.println("Jurusan tidak valid");
                        System.out.println("Silahkan input ulang");
                        validAll();
                    }

                    System.out.print("Umur (min 17 Tahun) : ");
                    int inputUmur = scanner.nextInt();
                    if(inputUmur >= 17){
                        System.out.println("Umur Valid");
                    } else {
                        System.out.println("Umur Tidak Valid");
                        System.out.println("Silahkan input ulang");
                        validAll();
                    }
                    mahasiswaRepository.dataMahasiwa(inputName,inputUmur,inputJurusan);
                    validAll();

            } else if (menu.equals("2")) {
                mahasiswaRepository.remove();
                validAll();
                break;
            } else if (menu.equals("3")) {
                System.out.println("====View Mahasiswa====");
                System.out.println("1. View By Index");
                System.out.println("2. View All");
                System.out.print("Masukkan pilihan : ");
                int inputSubMenu = scanner.nextInt();
                switch (inputSubMenu){
                    case 1:
                        System.out.println("====View Index====");
                        System.out.print("Masukkan pilihan anda : ");
                        int inputIndex = scanner.nextInt();
                        mahasiswaRepository.showIndex(inputIndex);
                        break;
                    case 2:
                        System.out.println("====View All====");
                        mahasiswaRepository.showAll();
                        break;
                } validAll();
            } else if(menu.equals("4")) {
                System.exit(0);
            }
        }
    }
}
