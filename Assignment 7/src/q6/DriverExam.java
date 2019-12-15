package q6;

/**<h1>Assignment 7: Question 6 ~ DriverExam</h1>
 * DriverExam creates a DriverExam test object that stores an answer key, the students answers, and methods to analyze the test.
 * @author Adam McKinlay ~ c0656685
 * @since March 26, 2019
 * 
 *																															  */
public class DriverExam {
	/*Properties*/
	private static final String[] ansKey = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};
	private String[] studentAnswers = new String[20];
	private int correct = 0;
	private int incorrect =0;
	
	/*Constructor*/
	/**Constructs DriverExam object
	 * 
	 * @param stuAns	The students answers of the test.
	 *												   */
	public DriverExam(String[] stuAns) {
		studentAnswers = stuAns.clone();
		
		for(int i=0; i<ansKey.length; i++) {
			if(studentAnswers[i].equals(ansKey[i])) {
				correct += 1;
			}else {
				incorrect +=1;
			}
		}
	}//DriverExam
	
	/*Methods*/
	/**passed determines if a student has passed or failed the test.
	 * 
	 * @return	true/false
	 *															  */
	public boolean passed() {		
		return correct < 15 ? false: true;
	}//passed
	
	/**totalCorrect gets the number of correct answers the student had.
	 * 
	 * @return	number of correct answers.
	 *																 */
	public int totalCorrect() {
		return correct;
	}//totalCorrect
	
	/**totalIncorrect returns the number of incorrect answers.
	 * 
	 * @return	number of incorrect answers.
	 *														*/
	public int totalIncorrect() {
		return incorrect;
	}//totalIncorrect
	
	/**questionsMissed finds which questions were incorrect.
	 * 
	 * @return	array containing incorrect questions.
	 *													  */
	public int[] questionsMissed() {
		int[] missed = new int[incorrect];
		
		for(int i=0, j=0; i<ansKey.length; i++) {
			if(!studentAnswers[i].equals(ansKey[i])) {
				missed[j] = i;
				j++;
			}
		}
		
		return missed;
	}//questionsMissed
}//DriverExam
