package JavaSE.Day7;

class Anonymous {
    void fact(int n) {
        int fact = 1;
        long now = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        long then = System.currentTimeMillis();
        long diff = then - now;
        System.out.println("Time different = " + diff);
        System.out.println("factorial is " + fact);
    }

    public static void main(String args[]) {
        new Anonymous().fact(4);//calling method with anonymous object
    }
}