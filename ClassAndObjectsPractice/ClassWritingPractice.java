/**
 * this class will tell the user the average GPA of their grades
 * three data attributes: scienceGrade, theologyGrade, and mathGrade
 */
public class ClassWritingPractice 
{
	
	private double scienceGrade;
	private double mathGrade;
	private double theologyGrade;
	
	private int gradeLevel;
	
	String name = new String();
	
	/**
	 * this constructor sets our data attributes to formal parameters
	 * 
	 * @param s scienceGrade
	 * @param m mathGrade
	 * @param t theologyGrade
	 * @param g gradeLevel
	 */
	public ClassWritingPractice (double s, double m, double t, int g, String n) 
	{
		scienceGrade = s;
		mathGrade = m;
		theologyGrade = t;
		gradeLevel = g;
		name = n;
	}
	/**
	 * this method calculates the average GPA of the student based off of
	 * their 3 grades (math, science, theology
	 * @return averageGPA
	 */
	
	private double getGPA() 
	{
		
		double sum = scienceGrade + mathGrade + theologyGrade;
		double averageGPA = sum/3;
		
		return averageGPA;	
		
	}
	/**
	 * this method will introduce the student with their name,
	 * grade level, and average GPA
	 */
	public void introduceSelf() 
	{
		
		System.out.println("My name is " + name + " ." + " I am a student in " +
				gradeLevel + " grade. My average GPA is " + getGPA() +
				" . ");
	}

}

