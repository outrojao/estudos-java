package entities;

public class Student {
	public String name;
	public double firstGrade;
	public double secondGrade;
	public double thirdGrade;
	
	public double finalGrade() {
		return firstGrade + secondGrade + thirdGrade;
	}
	
	public void checkGrade(double grade) {
		if(grade >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", 60.00 - grade);
		}
	}
	
}
