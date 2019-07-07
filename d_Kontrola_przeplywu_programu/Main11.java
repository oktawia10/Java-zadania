
public class Main11 {

    public static void main(String[] args) {

int n = 5;

             for (int i = 0; i <2* n; i++) {
                String row = "";

                for (int j = 0; j < n; j++) {
                  if (((i<n) && (i>=j))||
                      ((i>=n)&& (2*n-1-i>=j))
		     ){ 

                   row += "* ";}
                else {row +=j + 1 +" ";}

                }
                System.out.print(row + "\n");}

    }

}
