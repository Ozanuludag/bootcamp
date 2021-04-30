package ders2odev;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı(C#+Angular)", "Engin Demiroğ", "Ücretsiz");
		Course course2 = new Course("Yazılım Geliştirici Yetiştirme Kampı(Java+React)", "Engin Demiroğ", "Ücretsiz");
		Category category1 = new Category(1, "Backend");
		Category category2 = new Category(2, "Frontend");
		Category category3 = new Category(3, "Full stack");

		Course[] courses = { course1, course2 };
		for (Course course : courses) {
			System.out.println(course.name + " " + course.instructorName + " " + course.price);
		}
	}

}
