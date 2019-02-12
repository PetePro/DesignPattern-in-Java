package mvc;

public class Client {

	private static StudentModel retriveStudentFromDatabase() {
		StudentModel student = new StudentModel();
		student.setName("Robert");
		student.setSno("10");
		return student;
	}

	public static void main(String[] args) {
		StudentModel model = retriveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		controller.updateView();
		controller.setStudentName("John");
		controller.updateView();
	}

}
