/*
Program ma narysować tabliczkę mnożenia do 12. 
Taką jak tu http://www.vaughns-1-pagers.com/computer/multiplication-tables/times-table-12x12.gif
Tabele dwuwymiarowe definiujemy jako np. int[][], czyli po prostu tablica tablic.

Trzeba przerobić metodę timesTable, bo aktualnie zwraca same zera.

*/
import java.util.Arrays;  //import klasy, która pozwoli mi wypisać tablicę

class Problem5 {
    public void timesTable() {
        int[][] table = int[12][12];
        
        //implement here
        
        return table;
    }
    
    public void draw() {
        int[][] table = timesTable();
        for (int i = 0; i < table.length; i++) {    
            System.out.println(Arrays.toString(table[i])); //nowy wiersz
        }
    }
}
