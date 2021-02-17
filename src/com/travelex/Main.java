package com.travelex;

import com.travelex.classes.Cliente;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Cliente cliente = new Cliente();
        try {
            cliente.setNome(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            cliente.setNome("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            cliente.setNome("  teste  ");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            cliente.setNome("Andrei Eneas Nunes Lima");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(cliente.getNome());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(cliente.getAbreviadoNome());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(cliente.getMaiusculasNome());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(cliente.getPrimeiroNome());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(cliente.getUltimoNome());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
