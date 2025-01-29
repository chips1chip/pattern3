public class Pattern1 {
    public static void main(String[] args) {
    
        // Declare variables i and j 
        int i,j;
        // Outer loop controls the number of rows (5 rows in total)
        for(i = 0; i <= 4; i++) {
            // Inner loop controls the number of 'x' printed in each row
            for(j = 0; j <= i; j++) {
                // Print 'x' without moving to the next line
                System.out.print("x");
            }
            // Move to the next line after printing all 'x' in a row
            System.out.println("");
        }
    }
}
