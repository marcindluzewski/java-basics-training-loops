public class forEach {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        for (int i=0; i < tablica.length; i+=2 ) {
            tablica[i] = i+1;
//            System.out.println(tablica[i]);
        }
        for(int j:tablica){
            System.out.println(tablica[j]);
        }
    }
}
