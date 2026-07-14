public class array {
    public static void main(String[] args) {
        int d[] = new int[5];
        d[0] = 10;
        d[1] = 23;
        d[3] = 32;
        System.out.println(d[1]);


        System.out.println("\nthe nest difftrent thing or approach\n");
        //sdfghjkkkkkkkkkkkkkkkkkkkk.........
        int marks[] = {10, 20, 30, 40, 50};
        for (int i = 0;i<marks.length; i++) {
            if(i==2){
                continue;
            }
            System.out.println(marks[i]);
        }
    }
}