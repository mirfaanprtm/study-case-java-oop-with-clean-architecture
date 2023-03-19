package challenge.controller;

import challenge.entity.Mahasiswa;
import challenge.service.Validation;

import java.util.ArrayList;

public class App {
    ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

    public void mainMenu(){
        Validation validation = new Validation();
        validation.validAll();
    }


}
