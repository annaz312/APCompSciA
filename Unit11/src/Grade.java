
public class Grade {
	private double value;
	
	public Grade(){}
	public Grade(double score){
		setNumericGrade(score);
	}
	public void setNumericGrade(double num){
		value = num;
	}
	
	
	public double getNumericGrade(){
		return value;
	}
	
	public String getLetterGrade(){
		if (value < 60)
			return "F";
		else if (value >= 60 && value <70)
			return "D";
		else if (value >= 70 && value < 80)
			return "C";
		else if (value >=80 && value < 90)
			return "B";
		else
			return "A";
	}
	
	public String toString(){
		return getNumericGrade() + "\n" + getLetterGrade() +"\n";
	}
}
