public class testing {
    public static void main(String[] args) {

    }
    public static String testoo(int grade){
        if(grade>=90)
            return "Excellent";
        else if(grade>=80)
            return "Good";
        else if(grade>=50)
            return "Pass";
        else if(grade<50)
            return "Fail";
        return "null";
    }
}
