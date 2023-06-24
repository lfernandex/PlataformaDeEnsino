package entities;

public class Task extends Lesson{
	
	private String description;
	private int questionCount;
	
	public Task() {
		super();
	}

	public Task(String title, String description, int questionCount) {
		super(title);
		this.description = description;
		this.questionCount = questionCount;
	}
	
	public String getDescription() {
		return description;
	}

	public int getQuestionCount() {
		return questionCount;
	}

	@Override
	public Integer duration() {
		int duration = 0;
		for (int i = 0; i < questionCount; i++) {
			duration += 300;
		}
		return duration;
	}

}
