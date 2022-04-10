import java.util.*;

class ytot{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //moji input_text
    System.out.println("input a sentence");
    String moji = sc.next();

    //nannmoji de kugiruka saigomade kurikaesu
    int length = moji.length();
    System.out.println("length is "+length);
    int line = 0;
    String lines[] = new String[10000];
    int howmany = 0;
    int start_l = 0,end_l = 0;
    int max = 0;
    while(length > 0){
      System.out.printf("how many characters is the "+(line+1)+" line?  ");
      howmany = sc.nextInt();

      if(howmany > length)howmany = length;
      end_l = start_l + howmany;
      max = Math.max(max,howmany);
      lines[line] = moji.substring(start_l,end_l);
      System.out.println(lines[line]);
      start_l = end_l;
      line++;
      length-=howmany;
    }

    //output
    int count = 0;
    System.out.println("----------------------------");
    // while(count < line){
    //   System.out.println(lines[count]);
    //   count++;
    // }
    for(int m = 0;m<max;m++){
      for(int i = 0;i<line-1;i++){
        if(lines[(line -1 - i)].length() > m){
          System.out.print(lines[(line -1 - i)].substring(m,m+1));
        }else{
          System.out.print("  ");
        }
        System.out.print("  ");
      }
      if(lines[0].length() > m){
        System.out.println(lines[0].substring(m,m+1));
      }else{
        System.out.println("");
      }

    }

  }
}
