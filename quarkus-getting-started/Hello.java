import java.util.Random;

public class Hello {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int arrynumero[] = new int[100];

        for (int i = 0; i < 100; i++) {

            arrynumero[i] = random.nextInt(100);

        }

        for (int numero : arrynumero) {
            System.out.print(numero + ", ");
        }
        
    }
}