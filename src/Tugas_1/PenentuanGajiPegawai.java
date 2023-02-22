/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas_1;

import java.util.Scanner;

public class PenentuanGajiPegawai{
    public String nama, alamat, pengalaman, skill, departement;
    
    public PenentuanGajiPegawai(String nama, String alamat, String pengalaman, String skill, String departement){
        this.nama=nama;
        this.alamat=alamat;
        this.pengalaman=pengalaman;
        this.skill= skill;
        this.departement=departement; 
    }
    
    public int gaji(){
    int gaji = 0;
    switch(departement){
            case "IT":
                gaji+=8000000;
                break;
            case "HRD" :
                gaji+=5000000;
                break;
            case "Finance" :
                gaji+=4000000;
                break;
            default:
                System.out.println("------------------------------");
                System.out.println("Inputan Departemen TIDAK VALID");
                return 0;
        }
    switch(pengalaman){
            case "pemula":
                gaji+=500000;
                break;
            case "menengah" :
                gaji+=1000000;
                break;
            case "expert" :
                gaji+=2000000;
                break;
            default:
                System.out.println("------------------------------");
                System.out.println("Inputan pengalaman TIDAK VALID");
                return 0;
        }
    switch(skill){
            case "web":
                gaji+=1000000;
                break;
            case "mobile" :
                gaji+=2000000;
                break;
            case "dekstop" :
                gaji+=2500000;
                break;
            default:
                System.out.println("--------------------------");
                System.out.println("Inputan Skill TIDAK VALID");
                return 0;
    }
    return gaji;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama :");
        String nama = input.nextLine();
        System.out.print("Alamat :");
        String alamat = input.nextLine();
        System.out.print("Pengalaman (pemula/menengah/expert) : ");
        String pengalaman = input.nextLine();
        System.out.print("Skill (web/mobile/dekstop):");
        String skill = input.nextLine();
        System.out.print("Departement (IT/HRD/Finance):");
        String departement = input.nextLine();
        
        PenentuanGajiPegawai data = new PenentuanGajiPegawai(nama, alamat, pengalaman, skill, departement);
        System.out.println("Gaji : "+data.gaji());    
    }
    
}




