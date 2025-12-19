public class subjectexc extends Exception
{
    subjectexc(String message)
    {
        super(message);
    }

}

class TestSubjectExc
{
    static void checkSubject(String subject) throws subjectexc
    {
        if(subject.equals("Maths") || subject.equals("Science") || subject.equals("English"))
        {
            System.out.println("Valid Subject: " + subject);
        }
        else
        {
            throw new subjectexc("Invalid Subject: " + subject);
        }
    }

    public static void main(String[] args)
    {
        String[] subjects = {"Maths", "History", "Science", "Art", "English", "Geography"};

        for(String subject : subjects)
        {
            try
            {
                checkSubject(subject);
            }
            catch(subjectexc e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}