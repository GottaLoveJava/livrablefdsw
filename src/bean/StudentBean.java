package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class StudentBean {

	private String name;
	private String forname;
	private int age;
	private String email;
	private String genre;
	private double project1Grade;
	private double project2Grade;
	private String imageUri = "resources/img/061011-lapin-cretin-1_s2e.jpg";

	public StudentBean(String forname, String name, int age, String email) {


		this.setForname(forname);
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public StudentBean() {
		initList();
	}

	public void initList() {
		StudentBean fd = new StudentBean("François", "Destremau", 26, "francois.destremau@gmail.com");
		fd.setProject1Grade(27.5);
		fd.setProject2Grade (27.0);
		fd.setImageUri("resources/arnold-schwarzenegger-beach-1.jpg");

		StudentBean sw = new StudentBean("Stéphanie", "Woerner", 34, "woerner.stephanie@gmail.com");
		sw.setProject1Grade(27.5);
		sw.setProject2Grade(27.0);
		sw.setImageUri("resources/img/53556883a2bf4fe641df4044_scarlett-johansson-vanity-fair-ss01.jpg");
		}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getForname() {
		return forname;
	}

	public void setForname(String forname) {
		this.forname = forname;
	}



	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getProject1Grade() {
		return project1Grade;
	}

	public void setProject1Grade(double project1grade) {
		this.project1Grade = project1grade;
	}

	public double getProject2Grade() {
		return project2Grade;
	}

	public void setProject2Grade(double project2grade) {
		this.project2Grade = project2grade;
	}


}
