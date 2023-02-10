package Basics;

public class pattern11 {

	public static void main(String[] args) {
        row();
    }
    static int i=0,j=0;
    static void row()
    {
        if(i<5)
        {
            i++;
            column();
        }
    }
    static void column()
    {
      if(j<5)
      {
          j++;
          if(i>=j)
          {
              System.out.print("*");
          }
          else
          {
              System.out.print("0");
          }

          column();
      }
      else
      {
          System.out.println();
          j=0;
          row();
      }
    }

}
