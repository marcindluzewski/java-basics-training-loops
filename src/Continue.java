public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i<10 ;i++) {
            if (i == 5) {
                System.out.print("test ");
                continue;
            }
                System.out.print(i + " ");
        }
        for (int i = 0; i<10 ;i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
