/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itemsfromlangs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author akaleaf
 */
public class ItemsFromLangs {

    public String fileArrayToSave[] = new String[9999999];
    
//    public boolean isStringHaveCut(String string, String cut) {
//    
//        
//        
//    }
    
    /**
     * @param args the command line arguments
     */
    public void loadFromFile(String fName) {
    
        String fSaveName = "converted.txt";

//        try {
//
//            FileWriter file = new FileWriter(fSaveName);
//            int i = 0;
////            while (!fileArrayToSave[i].equals("null")) {
////                file.append(fileArrayToSave[i]);
////                file.append("\n");
////                i++;
////            }
//
//            file.flush();
//            file.close();
//
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//        }
        
        
        
//        String control[] = {"n", "a", "m", "e", "="};
        
        try(BufferedReader in = new BufferedReader(new FileReader(fName))) {
            
            FileWriter file = new FileWriter(fSaveName);
            
            String line;
            int strokeNumber = 0;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                int charNumber = 0;
                while (charNumber < line.length() - 4) {
                    try {
                    
                        if (line.charAt(charNumber) == 'n' && 
                            line.charAt(charNumber + 1) == 'a' &&
                            line.charAt(charNumber + 2) == 'm' &&
                            line.charAt(charNumber + 3) == 'e' &&
                            line.charAt(charNumber + 4) == '=') {
                            int toEnd = charNumber + 5;
                            while (toEnd < line.length()) {
                                file.append(line.charAt(toEnd));
                                toEnd++;
                            }
                            file.append("\n");
                        }
                        charNumber++;
                    
                    } catch (Exception e) {}
                }
            }
            file.flush();
            file.close();
        } catch (Exception e) {}
        
//        try {
//
//            FileReader file = new FileReader(fName);
//            FileReader file1 = new FileReader(fName);
//            /*
//            Следующие 2 объявления и цикл используются для счёта количества значащих строк в файле.
//            Далее информация передаётся при инициализации служебного массива fileArray.
//             */
//            Scanner scanForCount = new Scanner(file1);
//            int countOfStrokes = 0;
//
//            while (scanForCount.hasNextLine()) {
//
//                countOfStrokes++;
//
//            }
//
//            System.out.println(countOfStrokes);
//            
//            Scanner scan = new Scanner(file);
//            int index = 0;
//            /*
//            Служебный массив - используется для более удобной работы с содержимым файла.
//             */
//            String fileArray[] = new String[countOfStrokes + 1];
//
//            /*
//            Считывание строк файла в служебный массив fileArray.
//             */
//            while (scan.hasNextLine()) {
//
//                fileArray[index] = scan.nextLine();
//                if ((index != 0)) { 
//                    break; 
//                }
//                index++;
//                System.out.println(fileArray[index]);
//
//            }
//            
//            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
//
//            /*
//            Сокращение служебного массива до значащих элементов:
//            убираются null элементы массива, начиная с конца до появления первого не null элемента.
//             */
//            fileArray = Arrays.copyOf(fileArray, index);
//            
////            int i = 0;
////            while (i < fileArray.length) {
////                i++;
////            }
//            
//            int indexSave = 0;
//            int iter = 0;
//            while (iter < fileArray.length) {
//                
//                String string = fileArray[iter];
//                int itera = string.length() - 1;
//                
//                while (itera > 0) {
//
//                    if (string.charAt(itera - 0) == '=' && 
//                        string.charAt(itera - 1) == 'e' && 
//                        string.charAt(itera - 2) == 'm' && 
//                        string.charAt(itera - 3) == 'a' && 
//                        string.charAt(itera - 4) == 'n') {
//                    
//                        int point = itera;
//                        String addition = "";
//                        while (itera < string.length()) {
//                            
//                            itera++;
//                            
//                            try { 
//                                addition = addition + string.charAt(itera);
//                            } catch(Exception e) {} 
//                            
//                        }
//                        
//                        fileArrayToSave[indexSave] = addition;
//                        indexSave++;
//                        break;
//                    }
//
//                    itera--;
//
//                }
//                
//                iter++;
//                
//            }
//            
//            
//
//
//
//            /*
//            Приехали.
//            Одинокий catch.
//             */
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//        }
        
    }
    
    public void saveToFile(String fileName) {

        /*
        Имя файла
         */
        String fName = fileName + ".txt";

        try {

            FileWriter file = new FileWriter(fName);
            int i = 0;
            while (!fileArrayToSave[i].equals("null")) {
                file.append(fileArrayToSave[i]);
                file.append("\n");
                i++;
            }

            file.flush();
            file.close();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
    
}
