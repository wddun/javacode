public class ScholarshipWinner extends StudentAthlete
{
   private String award;

   //-----------------------------------------------------------------
   //  Sets up the student athlete using the specified information.
   //-----------------------------------------------------------------
   public ScholarshipWinner (String studentName, int courses, String sportName,
                       String awardCount)
   {
      super (studentName, courses, sportName);

      award = awardCount;
   }

   //-----------------------------------------------------------------
   //  Returns a description of this graduate student as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = super.toString();

      result += "\nAward Amount: " + award;

      return result;
   }
}
