package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] guestsList = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        System.out.print("Qual è il tuo nome? ");
        Scanner in = new Scanner(System.in);
        String guestName = in.nextLine();
        in.close();

        boolean isGuestFound = false;
        int index = 0;

        while (!isGuestFound && index < guestsList.length) {
            if (guestsList[index].toLowerCase().equals(guestName.trim().toLowerCase().replaceAll("\s+"," "))) {
                isGuestFound = true;
            }

            index++;
        }

        // for (int i = 0; i < guestsList.length; i++) {
        // if
        // (guestsList[i].toLowerCase().equals(guestName.trim().toLowerCase().replaceAll("\s+",
        // " "))) {
        // isGuestFound = true;
        // break;
        // }
        // }

        if (isGuestFound) {
            System.out.println("Benvenuto/a alla festa!");
        } else {
            System.out.println("Non sei presente nella lista!");
        }
    }
}
