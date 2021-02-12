public class zoho {
    public static void main(String arg[]) {
        String word = new String();
        String modified = new String();
        int n = word.length();
        int length = n;
        int s = 0;
        int i = 1;
        if (n % 2 == 1) {
            int c = (n / 2);
            String space = new String();
            //To get Free Space
            while (c < n) {
                while (s < n - 1) {
                    space = space + " ";
                    s++;
                }
                modified = word.substring(c, 1);
                System.out.println(modified);
                c++;


            }
        int y=0;
        while(int first=0<n){
            while(y<n/2)
            {
                space=space+" ";
            }
            modified= modified+word.substring(y,1)
            System.out.println(modified);
            y++;


        }
        }
    }
}