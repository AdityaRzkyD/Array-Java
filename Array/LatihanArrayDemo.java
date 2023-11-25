package Array;

import java.util.Scanner;

public class LatihanArrayDemo {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        LatihanArray arr = new LatihanArray();
        String[] Kode = new String[3];
        int[] Quantity = new int[3];
        int[] JumlahBayar = new int[3];
        int Total = 0;
        int ItemBarang;
        int i;
        int[] pil1 = new int[3];
        int[] pil2 = new int[3];


        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        System.out.print("Masukkan Item Barang  : ");
        ItemBarang = Input.nextInt();
        for (i = 0;i<ItemBarang;i++){
            System.out.println("Data ke "+(i+1));
            System.out.print("Masukkan Kode         : ");
            Kode[i] = Input.next();
            System.out.print("Masukkan Jumlah Beli  : ");
            Quantity[i] = Input.nextInt();
            switch (Kode[i]) {
                case "a001":
                    pil1[i] = 1;
                    break;
                case "a002":
                    pil1[i] = 2;
                    break;
                case "a003":
                    pil1[i] = 3;
                    break;
                default:
                    break;
            }
        }

        for(i = 0; i<arr.Kode.length;i++){
            switch (arr.Kode[i]) {
                case "a001":
                    pil2[i] = 1;
                    break;
                case "a002":
                    pil2[i] = 2;
                    break;
                case "a003":
                    pil2[i] = 3;
                    break;
                default:
                    break;
            }
        }

        System.out.println();
        System.out.println("TOKO SERBA ADA");
        System.out.println("*************************");
        System.out.println("No    Kode Barang     Nama Barang       Harga       Jumlah Beli     Jumlah Bayar");
        System.out.println("================================================================================");
        for(i = 0;i<ItemBarang;i++){
            System.out.print((1+i));
            System.out.print("        "+Kode[i]);
            if(pil1[i] == pil2[0]){
                System.out.print("            "+arr.NamaBarang[0]);
                System.out.print("         "+arr.Harga[0]);
                JumlahBayar[i] = arr.Harga[0]*Quantity[i];
            }
            else if (pil1[i] == pil2[1]) {
                System.out.print("            "+arr.NamaBarang[1]);
                System.out.print("         "+arr.Harga[1]);
                JumlahBayar[i] = arr.Harga[1]*Quantity[i];
            }
            else if (pil1[i] == pil2[2]) {
                System.out.print("            "+arr.NamaBarang[2]);
                System.out.print("         "+arr.Harga[2]);
                JumlahBayar[i] = arr.Harga[2]*Quantity[i];
            }
            System.out.print("              "+Quantity[i]);
            System.out.println("             "+JumlahBayar[i]);
        }

        System.out.println("===============================================================================");
        for(i = 0;i<ItemBarang;i++){
            Total += JumlahBayar[i];
        }

        System.out.println("Total Bayar                     "+Total);
        System.out.println("===============================================================================");
    }
}
