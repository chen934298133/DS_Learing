package DS.String;

public class StringBuffer_Test {
    public static void main(String[] args){

        StringBuffer_Test s1 = new StringBuffer_Test();
        StringBuffer res = new StringBuffer();
        res.append("1 3 5");
        String string = "1 3 5";
        System.out.println(string.replace(" ", "_"));
        System.out.println(res.length());
        System.out.println(res.capacity());
        System.out.println(res.charAt(1));
//        s1.replaceSpace(res);
        System.out.println(s1.replaceSpace(res));
    }

    public String replaceSpace(StringBuffer str) {
//         return str.toString().replace(" ", "%20");
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                res.append("%20");
            }else{
                res.append(str.charAt(i));
            }
        }
        return res.toString();

    }

}
