/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author ASUS
 */
public class NameException extends Exception {
    public void showMessage(){
        System.out.println("[!] Nama Tidak Boleh Kosong [!]");
    }
}
