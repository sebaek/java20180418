package chapter14.exercise06;

import java.util.function.ToIntFunction;

public class LambdaExample {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	private static double avg(ToIntFunction<Student> func) {
		int sum = 0;
		for (Student s : students) {
			sum += func.applyAsInt(s);
		}
		return (double) sum / students.length;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("영어 평균 점수 :" + englishAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 점수 :" + mathAvg);
		
		englishAvg = avg(Student::getEnglishScore);
		System.out.println("영어 평균 점수 :" + englishAvg);
		
		mathAvg = avg(Student::getMathScore);
		System.out.println("수학 평균 점수 :" + mathAvg);
	}
	
	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;
		public Student(String name, int englishScore, int mathScore) {
			super();
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}
		
		public String getName() {
			return name;
		}
		public int getEnglishScore() {
			return englishScore;
		}
		public int getMathScore() {
			return mathScore;
		}
	}
}
