package test;


public class TestLog {

    public static void print(Object... strs){
        if(strs != null){
            StringBuilder sb = new StringBuilder();
            for(Object str : strs){
                sb.append(str);
            }
            if(sb.length() > 0){
                System.out.println(sb);
            }
        }
    }
    
}
