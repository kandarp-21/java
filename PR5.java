/**
 * PR5
 */
class Matrix {
    int a1[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
    int a2[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

    void addition() {
        System.out.println(a1.length);
      System.out.println("----Adition----");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a1[i][j]+a2[i][j]);
            }
            System.out.println();
        }
    }

    void display() {
        int i;
        System.out.println("Matrix 1");
        for (i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(a1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Matrix 2");
        for (i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(a1[i][j]);
            }
            System.out.println();
        }
    }
    void substraction() {
        System.out.println("----Substraction----");
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  System.out.print(a1[i][j]-a2[i][j]);
              }
              System.out.println();
          }
      }
    void multiplication()
    {
        int mul[][]=new int[a1.length][a1.length];
        System.out.println("----Multiplication----");
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a1.length;j++)
            {
                for(int k=0;k<a1.length;k++)
                {
                   mul[i][j]+=a1[j][k]*a2[k][j];
                }
            }
        }
        for (int i = 0; i < mul.length; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(mul[i][j]);
            }
            System.out.println();
        }
       System.out.println("----------");
       System.out.println(mul[0][0]+" "+mul[0][1]+" "+mul[0][2]);
    } 

}

public class PR5 {

    public static void main(String[] args) {
        System.out.println("Hello word");
        Matrix m1 = new Matrix();
        m1.display();
        m1.addition();
        m1.substraction();
        m1.multiplication();
    }
}
