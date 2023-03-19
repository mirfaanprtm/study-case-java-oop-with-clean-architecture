package challenge.entity;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    private String name;
    private int umur;
    private String jurusan;

    public Mahasiswa(String name, int umur, String jurusan) {
        this.name = name;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    public Mahasiswa() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "Data Mahasiswa : " +
                "\nNama : " + name +
                "\nUmur : " + umur +
                "\nJurusan : " + jurusan +
                "\n======================";
    }
}
