package RecursionTDD;

public class Group5{
  public static void main (String[] args){
    //System.out.println(changeXY("codex"));
  }

  public static String changeXY(String strWord){
    // Base Case 
    if (strWord.equals("")){
      return("");
    // Recursive Step
    }else if(strWord.substring(0,1).equals("x")){
      return "y" + changeXY(strWord.substring(1));
    }else{
      return strWord.substring(0,1) + changeXY(strWord.substring(1));
    }
  }
}