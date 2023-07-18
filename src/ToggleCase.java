import java.util.Scanner;

public class ToggleCase {
    static String toggle(String str){
        char[] charArr= str.toCharArray();
        for(int i=0;i<charArr.length;i++){
            char ch = charArr[i];
            if(ch >='A' && ch <='Z'){
                charArr[i] = (char)(ch+32);
            }
            if(ch >='a' && ch <='z'){
                charArr[i] = (char)(ch-32);
            }
        }
        return new String(charArr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(toggle(str));

    }
}
