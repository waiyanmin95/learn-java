package compro.Sample;

public class Q901countRepresentations {
    public static int countRepresentations(int n) {
        int count = 0;
        int time = 0;
        for (int r20 = 0; r20 <= n; r20+=20) {
            for (int r10 = 0; r10 <= n; r10+=10) {
                for (int r5 = 0; r5 <= n; r5+=5) {
                    for (int r2 = 0; r2 <= n; r2+=2) {
                        for (int r1 = 0; r1 <= n; r1++) {
                            time++;
                            if ( r1 + r2 + r5 + r10 + r20 == n ) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Loop Count: "+time);
        return count;
    }


    // Best ( Minimum loop )
    public static int countRepresentationsOther(int n) {
        if ( n == 0 ) {
            return 0;
        }
        int count = 0;
        int time = 0;
        // r20 formula n / 20
        for (int r20 = 0; r20 <= n/20; r20++) {
            // r10 formula ( n - ( r20 * 20)) / 10 )
            for (int r10 = 0; r10 <= (n - (r20 * 20))/10; r10++) {
                // r5 formula ( n - ( r10 * 10 + r20 * 20) / 5
                for (int r5 = 0; r5 <= (n - (r10 * 10 + r20 * 20))/5; r5++) {
                    // r2 formula ( n - ( r5 * 5 + r10 * 10 + r20 * 20) / 2
                    for (int r2 = 0; r2 <= (n - (r5 * 5 + r10 * 10 + r20 * 20))/2; r2++) {
                        // r1 formula ( n - ( r2 * 2 + r5 * 5 + r10 * 10 + r20 * 20) / 1
                        for (int r1 = 0; r1 <= (n - (r2 * 2 + r5 * 5 + r10 * 10 + r20 * 20)); r1++) {
                            time++;
                            if ( r1 + (r2 * 2) + (r5 * 5) + (r10 * 10) + (r20 * 20) == n ) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Loop Count: "+time);
        return count;
    }


    // Average
    public  static int countRepresentationsAnother(int numRupees) {
        if ( numRupees == 0 ) {
            return 0;
        }
        int count = 0;
        int time = 0;
        int sumRupees1 = 0, sumRupees2 = 0, sumRupees5 = 0, sumRupees10 = 0, sumRupees20 = 0;
        for (int rupee20=0; rupee20<=numRupees; rupee20++) {
            sumRupees10 = rupee20 * 20;
            if(sumRupees10 > numRupees)
                break;

            for (int rupee10=0; rupee10<=numRupees; rupee10++) {
                sumRupees10 = rupee20 * 20 + rupee10 * 10;
                if(sumRupees10 > numRupees)
                    break;

                for (int rupee5=0; rupee5<=numRupees; rupee5++) {
                    sumRupees5 = rupee20 * 20 + rupee10 * 10 + rupee5 * 5;
                    if(sumRupees5 > numRupees)
                        break;

                    for (int rupee2=0; rupee2<=numRupees; rupee2++) {
                        sumRupees2 = rupee20 * 20 + rupee10 * 10 + rupee5 * 5 + rupee2 * 2;
                        if(sumRupees2 > numRupees)
                            break;

                        for (int rupee1=0; rupee1<=numRupees; rupee1++) {
                            time++;
                            sumRupees1 = rupee20 * 20 + rupee10 * 10 + rupee5 * 5 + rupee2 * 2 + rupee1;
                            if(sumRupees1 == numRupees) {
                                count++;
                            }
                            if(sumRupees1 > numRupees)
                                break;
                        }
                    }
                }
            }
        }
        System.out.println(time);
        return count;
    }
    public static void main(String[] args) {
//        System.out.println(countRepresentations(12));
//        System.out.println(countRepresentations(5));
//        System.out.println(countRepresentations(1000));
//        System.out.println(countRepresentationsOther(1000));
        System.out.println(countRepresentationsOther(1000));
        System.out.println(countRepresentationsAnother(1000));
    }
}
