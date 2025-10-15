package Basics_programs_and_java_concepts;

public class Performance_string {
    public static void main(String[] args) {
//        String series = " ";
//        for(int i = 0 ; i < 26 ; i++){
//            char alp = (char)('a' + i);
//            series = series + " " + alp;
//            System.out.println(alp);
//        }
//        System.out.println(series);
        //it is slow and takes more memory due to creation of new string object everytime because string are imutable
        //cannot be modifies , for this and in loops we prefer string builder , because the are mutable and no new object
        //is created everytime so they are memory efficient and fast
//        StringBuilder sb  = new StringBuilder();
//        for(int i= 0 ; i<26 ; i++){
//            char alp = (char)('a' + i);
//            sb = sb.append(alp);
//        }
//        System.out.println(sb);
        StringBuilder sb = new StringBuilder();
        sb.append("My name is paras");
        System.out.println(sb);

    }
}
