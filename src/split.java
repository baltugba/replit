import java.util.Arrays;

public class split {
    public static void main(String[] args) {

        String str ="ttbal@gmail.com";
        String [] strnew = str.split("");
        System.out.println(Arrays.toString(strnew));

        System.out.println("char"+ Arrays.toString(str.toCharArray()));

        Arrays.sort(strnew);
        System.out.println(Arrays.toString(strnew));

        System.out.println(Arrays.toString(str.split("@")));

        String str2 = str.split("@")[1].split("")[2].toUpperCase();
        System.out.println(str2);
    }
}
