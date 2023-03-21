//********************************************************************
//  Student.java       Author: Lewis/Loftus/Cocking
//
//  Represents a college student.
//********************************************************************

public class Student
{
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   private int test1, test2, test3;

   //-----------------------------------------------------------------
   //  Sets up this Student object with the specified initial values.
   //-----------------------------------------------------------------
   public Student (String first, String last, Address home,
                   Address school)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      test1 = 0;
      test2 = 0;
      test3 = 0;
   }
   public Student (String first, String last, Address home,
                   Address school, int firsttest, int secondtest, int thirdtest)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      test1 = firsttest;
      test2 = secondtest;
      test3 = thirdtest;
   }   
   
   
   public void setTestScore(int testNum, int Score)
   {
       if(testNum == 1)
       {
           test1 = Score;
       }
       else if (testNum == 2)
       {
           test2 = Score;
       }
       else if (testNum == 3)
       {
           test3 = Score;
       }
       else 
       {
           System.out.print("Invalid input.");
       }
   }
   
   public int getTestScore(int testNum)
   {
       if (testNum == 1)
       {
           return test1;
       }
       else if (testNum == 2)
       {
           return test2;
       }
       else
       {
           return test3;
       }
   }
   
   public double average()
   {
       double av = test1 + test2 + test3;
       av = av / 3;
       return av;
   }

   //-----------------------------------------------------------------
   //  Returns this Student object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress + "\n";
      result += "Test one score: " + test1 + "\n";
      result += "Test two score: " + test2 + "\n";
      result += "Test three score: " + test3 + "\n";
      result += "Average: " + average() + "\n";
      
      return result;
   }
}