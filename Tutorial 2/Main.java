public class Main {
    public static void main(String[] args) {
        int i, j, m, n, k;
        float f, g;
        char c;

        k = i = j = 2;
        m = n = 5;
        f = 12.0f;
        g = 4.0f;
        c = 'X';

        System.out.println(k + 12 * m);
        System.out.println(m / j);
        System.out.println(n % j);
        System.out.println(m / j * j);
        System.out.println(f + 10 * 5 + g);
        System.out.println(++i * n);

        System.out.println("=================");

        int a = 2, b = 3, c1 = 4, d = 5;
        float k1 = 4.3f;

        System.out.println(--b * a + c1 * d);
        System.out.println(a++);
        System.out.println(-2 * (g - k1) + c1);
        System.out.println(c1 = c1++);
        System.out.println("c1 is " + c1 + " a is " + a );
        System.out.println(c1 = ++c1 * a++);
        System.out.println("c1 is " + c1 + " a is " + a );
    }
}
