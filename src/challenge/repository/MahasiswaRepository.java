package challenge.repository;

import challenge.entity.Mahasiswa;

import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaRepository {
    private ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();

    public MahasiswaRepository() {
        mahasiswa = new ArrayList<Mahasiswa>();
    }

    public void dataMahasiwa(String name, int umur, String jurusan){
        mahasiswa.add(new Mahasiswa(name, umur, jurusan));
        for (Mahasiswa maha : mahasiswa){
            System.out.println("================================="+
                                "\nNama : " + maha.getName() +
                                "\nUmur : " + maha.getUmur() +
                                "\nJurusan : " + maha.getJurusan() +
                                "\n==============================");
        }
    }


    public void sizeOfData(){
        if(this.mahasiswa.size() >= 5){
            this.mahasiswa = null;
        }
    }

    public void remove(){
        int removeMahasiswa = mahasiswa.size();
        mahasiswa.remove(removeMahasiswa - 1);
    }

    public void showAll(){
        this.mahasiswa.forEach(System.out::println);
    }

    public void showIndex(int n){
        System.out.println(this.mahasiswa.get(n));
    }

}
