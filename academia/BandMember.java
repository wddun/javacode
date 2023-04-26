
public class BandMember extends Student
{
   private String instrument;

   //-----------------------------------------------------------------
   //  Sets up the student athlete using the specified information.
   //-----------------------------------------------------------------
   public BandMember (String studentName, int courses,
                       String instrumentName)
   {
      super (studentName, courses);

      instrument = instrumentName;
   }

   //-----------------------------------------------------------------
   //  Returns a description of this graduate student as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = super.toString();

      result += "\nInstrument: " + instrument;

      return result;
   }
}
