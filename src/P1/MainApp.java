package P1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {


    public static void main(String[] args) {

         List<EchipamenteElectronice> echipamente = new ArrayList<>();

        try{
            BufferedReader reader = new BufferedReader(new FileReader("echipamente.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                String[] elemente = line.split(" ");
                String denumire = elemente[0];
                int nr_inventar = Integer.parseInt(elemente[1]);
                double pret = Double.parseDouble(elemente[2]);
                String zona_mag = elemente[3];
                StareEchipament status = StareEchipament.valueOf(elemente[4]);

                if("Imprimanta".equals(denumire) && elemente.length == 9){
                    int ppm = Integer.parseInt(elemente[5]);
                    int dpi = Integer.parseInt(elemente[6]);
                    int p_car = Integer.parseInt(elemente[7]);
                    String mod_tiparire = elemente[8];

                    Imprimante imp = new Imprimante(denumire, nr_inventar, pret, zona_mag, status, ppm, dpi, p_car, mod_tiparire);
                    echipamente.add(imp);
                }

                if("Copiator".equals(denumire) && elemente.length == 7){
                    int p_ton = Integer.parseInt(elemente[5]);
                    String format_copiere = elemente[6];

                    Copiator cop = new Copiator(denumire, nr_inventar, pret, zona_mag, status, p_ton, format_copiere);
                    echipamente.add(cop);
                }

                if("SistemDeCalcul".equals(denumire) && elemente.length == 9){
                    String tip_mon = elemente[5];
                    double vit_proc = Double.parseDouble(elemente[6]);
                    int c_hdd = Integer.parseInt(elemente[7]);
                    String sistemOperare = elemente[8];

                    SistemeDeCalcul sis = new SistemeDeCalcul(denumire, nr_inventar, pret, zona_mag, status, tip_mon, vit_proc, c_hdd, sistemOperare);
                    echipamente.add(sis);
                }
            }
        }catch(IOException e){
            System.err.println("Fisier gol!!!" + e.getMessage());
        }

        do{
            System.out.println("---------------------------------------");
            System.out.println("1).Afisarea tuturor echipamentelor");
            System.out.println("2).Afisarea imprimantelor");
            System.out.println("3).Afisarea copiatoarelor");
            System.out.println("4).Afisarea sistemelor de calcul");
            System.out.println("5).Modificarea starii unui echipament");
            System.out.println("6).Setarea unui anumit mod de scriere pentru o imprimanta");
            System.out.println("7).Setarea unui anumit format de copiere pentru copiatoare");
            System.out.println("8).Instalarea unui anumit sistem de operare pe un sistem de calcul");
            System.out.println("9).Afisarea echipamentelor vandute");
            System.out.println("10).Serializare/deserializare in fisierul echip.bin");
            System.out.println("---------------------------------------");

            System.out.print("Introduceti optiunea dorita: ");
            Scanner scanner = new Scanner(System.in);
            int opt = scanner.nextInt();

            switch (opt){
                case 1:
                    for(EchipamenteElectronice e: echipamente){
                        System.out.println(e);
                    }
                    break;
                case 2:
                    for(EchipamenteElectronice e: echipamente){
                        if(e instanceof Imprimante){
                            System.out.println(e);
                        }
                    }
                    break;
                case 3:
                    for(EchipamenteElectronice e: echipamente){
                        if(e instanceof Copiator){
                            System.out.println(e);
                        }
                    }
                    break;
                case 4:
                    for(EchipamenteElectronice e: echipamente){
                        if(e instanceof SistemeDeCalcul){
                            System.out.println(e);
                        }
                    }
                    break;
                case 5: // nu merge
                    System.out.print("Introduceti numarul de inventar al echipamenului pe care vreti sa schimbati starea: ");
                    Scanner scanner3 = new Scanner(System.in);
                    int nr_inventar_de_cautat = scanner3.nextInt();
                    for(EchipamenteElectronice e: echipamente) {
                        if (e.nr_inventar == nr_inventar_de_cautat) {
                            System.out.println("stare noua: ");
                            scanner3.nextLine();
                            String stare_noua = scanner3.nextLine();
                            switch (stare_noua) {
                                case "achizitionat":
                                    e.setStatus(StareEchipament.achizitionat);
                                    break;
                                case "expus":
                                    e.setStatus(StareEchipament.expus);
                                    break;
                                case "vandut":
                                    e.setStatus(StareEchipament.vandut);
                                    break;
                                default:
                                    break;
                            }
                            System.out.println(e);

                        }
                    }
                    break;
                        case 6:
                            System.out.print("Introduceti tipul de scriere nou pentru imprimanta: ");
                            Scanner scanner4 = new Scanner(System.in);
                            String tip_de_scriere_cautat = scanner4.nextLine();
                            System.out.print("Introduceti codul nou pentru imprimanta: ");
                            int cod = scanner4.nextInt();
                            for(EchipamenteElectronice e: echipamente) {
                                if(e instanceof Imprimante && e.getNr_inventar() == cod){
                                    System.out.println(e);
                                    ((Imprimante) e).setMod_tiparire(tip_de_scriere_cautat);
                                    System.out.println(e);
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Optiune gresita!!");
                    break;
            }
        }while(true);

    }

}
