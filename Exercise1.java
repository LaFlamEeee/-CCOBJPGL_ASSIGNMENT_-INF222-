public class App {

    static boolean iwillBehave = false;
    static boolean iwillGraduate = true; 

    public static void main (String [] args) throws Exception{

      assert iwillBehave == true : "Kasi mabait ako";
      
      College();

      assert iwillGraduate == true : "Sana gumraduate";
    }
    static void College(){
        iwillGraduate = false;
        //System.out.println("Ang galing");
    }
}
