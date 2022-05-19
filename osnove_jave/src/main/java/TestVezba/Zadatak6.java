package TestVezba;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ringla1 = 0;
        int ringla2 = 0;
        System.out.print("Unesite koja ringla: ");
        int kojaRingla = s.nextInt();
        System.out.println("Unesite akciju(+,-): ");
        String akcija = s.next();
        if (kojaRingla == 1) {

            if (akcija.equals("+")) {
                if (ringla1 < 3) {
                    ringla1 = ringla1 + 1;
                } else {
                    ringla1 = 0;
                }
            } else {
                if (ringla1 != 0) {
                    ringla1 = ringla1 - 1;
                } else {
                    ringla1 = 3;
                }
            }
        }
        else {
            if (akcija.equals("+")) {
                if (ringla2 < 3) {
                    ringla2 = ringla2 + 1;
                } else {
                    ringla2 = 0;
                }
            } else {
                if (ringla2 != 0) {
                    ringla2 = ringla2 - 1;
                } else {
                    ringla2 = 3;
                }
            }
        }
        System.out.print("Unesite koja ringla: ");
        kojaRingla = s.nextInt();
        System.out.println("Unesite akciju(+,-): ");
        akcija = s.next();
        if (kojaRingla == 1) {

            if (akcija.equals("+")) {
                if (ringla1 < 3) {
                    ringla1 = ringla1 + 1;
                } else {
                    ringla1 = 0;
                }
            } else {
                if (ringla1 != 0) {
                    ringla1 = ringla1 - 1;
                } else {
                    ringla1 = 3;
                }
            }
        }
        else {
            if (akcija.equals("+")) {
                if (ringla2 < 3) {
                    ringla2 = ringla2 + 1;
                } else {
                    ringla2 = 0;
                }
            } else {
                if (ringla2 != 0) {
                    ringla2 = ringla2 - 1;
                } else {
                    ringla2 = 3;
                }
            }
        }
        System.out.print("Unesite koja ringla: ");
        kojaRingla = s.nextInt();
        System.out.println("Unesite akciju(+,-): ");
        akcija = s.next();
        if (kojaRingla == 1) {

            if (akcija.equals("+")) {
                if (ringla1 < 3) {
                    ringla1 = ringla1 + 1;
                } else {
                    ringla1 = 0;
                }
            } else {
                if (ringla1 != 0) {
                    ringla1 = ringla1 - 1;
                } else {
                    ringla1 = 3;
                }
            }
        }
        else {
            if (akcija.equals("+")) {
                if (ringla2 < 3) {
                    ringla2 = ringla2 + 1;
                } else {
                    ringla2 = 0;
                }
            } else {
                if (ringla2 != 0) {
                    ringla2 = ringla2 - 1;
                } else {
                    ringla2 = 3;
                }
            }
        }
        System.out.print("Unesite koja ringla: ");
        kojaRingla = s.nextInt();
        System.out.println("Unesite akciju(+,-): ");
        akcija = s.next();
        if (kojaRingla == 1) {

            if (akcija.equals("+")) {
                if (ringla1 < 3) {
                    ringla1 = ringla1 + 1;
                } else {
                    ringla1 = 0;
                }
            } else {
                if (ringla1 != 0) {
                    ringla1 = ringla1 - 1;
                } else {
                    ringla1 = 3;
                }
            }
        }
        else {
            if (akcija.equals("+")) {
                if (ringla2 < 3) {
                    ringla2 = ringla2 + 1;
                } else {
                    ringla2 = 0;
                }
            } else {
                if (ringla2 != 0) {
                    ringla2 = ringla2 - 1;
                } else {
                    ringla2 = 3;
                }
            }
        }
        System.out.println("Ringla1= " + ringla1 +" Ringla2= "+ringla2);
    }


}
