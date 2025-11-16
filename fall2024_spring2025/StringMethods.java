import java.util.Scanner;
public class StringMethods
{
public static void main(String[] args)
 {
  /* String name = "Bron";

  .equals method
  boolean result = name.equals("Bron");
  System.out.println(result);
  boolean result = name.equals("bron");
  System.out.println(result);*/

  /*.equalsIgnoreCase method
  boolean result = name.equalsIgnoreCase("bron");
  System.out.println(result);*/

  /*.length method
  int result = name.length();
  System.out.println("Length of Bron is "+result);*/
  /*.charAt method
  char result = name.charAt(0);
  System.out.println(result);*/

  /*.index method
  int result = name.indexOf("B");
  System.out.println(result);*/

  /*.UpperCase method
  System.out.print(name.UpperCase());*/

  /*.LowerCase method
  System.out.print(name.LowerCase());*/

  /*replace method
  System.out.print(name.replace("r","o"));*/
  /*String x = "abcdedcbca";
  int i =0;
  int j=x.length()-1;
  while(i<j)
  {
	  if(x.charAt(i)!= x.charAt(i))
	  {
		  System.out.println("Not a palindrome");
	  }
	  i++;
	  j--;
	  System.out.println("Palindrome");
  }*/
  /*String name = "Han";
  double grade = 80.8091;
  int id=19772015;
  String res =String.format("Student name:%s!,grade:%.2f,id:%.2d ",name,grade,id);
  System.out.println(res);*/
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter a basketball player(Luka,Jordan,Lebron,Giannis,Shaq):");
   String userinput = scan.nextLine();
   //Player 1
   String playerone = "Luka Doncic";
   String positionone="PG";
   String teamone ="Dallas Mavericks,Los Angeles Lakers";
   double heightone= 198.12;
   int JerseyNumberOne = 77;
   String playerOneInfo = String.format("Player: %s, Position:%s,Team:%s,Height:%.2f cm, Jersey:%d", playerone,positionone,teamone,heightone,JerseyNumberOne);

   //Player 2
   String playertwo = "Michael Jordan";
   String positiontwo="SG/SF";
   String teamtwo ="Chicago Bulls,Washington Wizards";
   double heighttwo = 194.94;
   int JerseyNumberTwo = 23;
   String playerTwoInfo = String.format("Player: %s, Position: %s, Team:%s, Height:%2f cm, Jersey:%d",playertwo,positiontwo,teamtwo,heighttwo,JerseyNumberTwo);


   //Player 3
   String playerthree = "Lebron James";
   String positionthree="SF/PF";
   String teamthree ="Cleveland Caviliers,Miami Heat,Los Angeles Lakers";
   double heightthree = 205.74;
   int JerseyNumberThree = 6;
   String playerThreeInfo = String.format("Player: %s, Position: %s, Team:%s, Height:%2f cm, Jersey:%d",playerthree,positionthree,teamthree,heightthree,JerseyNumberThree);


   //Player 4
   String playerfour = "Giannis Antetokounmpo";
   String positionfour="PF/C";
   String teamfour ="Milwaukee Bucks";
   double heightfour = 210.82;
   int JerseyNumberFour = 34;
   String playerFourInfo = String.format("Player: %s, Position: %s, Team:%s, Height:%2f cm, Jersey:%d",playerfour,positionfour,teamfour,heightfour,JerseyNumberFour);

   //Player 5
   String playerfive = "Shaquile O'Neal";
   String positionfive="C";
   String teamfive="Orlando Magic,Los Angeles Lakers,Miami Heat,Phoenix Suns,Cleveland Caviliers,Boston Celtics";
   double heightfive= 215.9;
   int JerseyNumberFive= 32;
   String playerFiveInfo = String.format("Player: %s, Position: %s, Team:%s, Height:%2f cm, Jersey:%d",playerfive,positionfive,teamfive,heightfive,JerseyNumberFive);

//Player-1
 if (userinput.equals("Luka"))
 {
    System.out.println(playerOneInfo);
 }
 else if(userinput.equals("Wonderboy"))
 {
    System.out.println(playerOneInfo);
 }
//Player-2
 if (userinput.equals("Jordan"))
  {
     System.out.println(playerTwoInfo);
  }
  else if(userinput.equals("MJ"))
  {
     System.out.println(playerTwoInfo);
 }
//Player-3
 if (userinput.equals("Lebron"))
  {
     System.out.println(playerThreeInfo);
  }
  else if(userinput.equals("King"))
  {
     System.out.println(playerThreeInfo);
  }
 //Player-4
 if (userinput.equals("Giannis"))
   {
      System.out.println(playerFourInfo);
   }
   else if(userinput.equals("Greek Freak"))
   {
      System.out.println(playerFourInfo);
   }
//Player-5
 if (userinput.equals("Shaq"))
    {
       System.out.println(playerFiveInfo);
    }
    else if(userinput.equals("O'Neal "))
    {
       System.out.println(playerFiveInfo);
    }

 }
}