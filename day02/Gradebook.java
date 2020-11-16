package day02;

public class Gradebook {
	int id;
	String name;
	int korean;
	int english;
	int math;
	
	int getId() {
		return id;		
	}
	void setId(int Id) {
		this.id = Id;
	}
	String getName() {
		return name;		
	}
	void setName(String name) {
		this.name = name;
	}
	
	int getKorean() {
		return korean;
	}
	void setKorean(int korean) {
		this.korean = korean;
	}
	int getEnglish() {
		return english;
	}
	void setEnglish(int english) {
		this.english = english;
	}
	int getMath() {
		return math;
	}
	void setMath(int math) {
		this.math = math;
	}

}
