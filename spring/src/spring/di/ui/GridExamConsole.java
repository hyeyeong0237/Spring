package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class GridExamConsole implements ExamConsole {
	
	
	private Exam exam;
	
	public GridExamConsole() {
	}
	
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		
		System.out.println(" ___________________");
		System.out.println(" | total  |   avg  |");
		System.out.println(" ___________________");
		System.out.printf("|   %d   |   %f   |", exam.total(), exam.avg());
		System.out.println(" ___________________");

	}

	@Autowired()
	//@Qualifier("exam1")
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
