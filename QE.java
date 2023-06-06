package day8assignment;

public class QE {
    public static void main(String[] args) {

        double a = 7.2, b = 5, c = 9;
        double firstroot;
        double secondroot;
        double det = b * b - 4 * a * c;
        if (det > 0) {
            firstroot = (-b + Math.sqrt(det)) / (2 * a);
            secondroot = (-b - Math.sqrt(det)) / (2 * a);
            System.out.format("first root = %.2f and second root = %.2f " ,firstroot,secondroot);

        }
        else if(det == 0){
            firstroot = secondroot = -b / (2 * a);
            System.out.format(" first root = second root= %.2f; ", firstroot);

        }
        else
        {
            double real = -b / (2 * a);

            double imaginary = Math.sqrt(-det) / (2 * a);

            System.out.printf("first root =%.2f + %.2fi",real ,imaginary);
            System.out.printf("\n second root =%.2f - %.2fi",real ,imaginary);
        }
    }
}

