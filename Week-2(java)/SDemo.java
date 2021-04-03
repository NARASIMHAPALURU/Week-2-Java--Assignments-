class Student1{
}
class ScienceStudent extends Student1{
	public String Practical;
	ScienceStudent(String Practical )
	{
		this.Practical = Practical;
	}
	void display()
	{
		System.out.println("I Submited my  "+Practical+"  Assignments with practical..");
	}

}
class ArtsStudent extends Student1{
	public String Project;
	ArtsStudent(String Project)
	{
		this.Project = Project;
	}
	void display()
	{
		System.out.println("I Submited my  "+Project+"   Project ..");
	}

}
class SDemo{
	public static void main(String [] args){
		ScienceStudent s1 = new ScienceStudent("JAVA");
		ArtsStudent a1 = new ArtsStudent("JAVA");
		s1.display();
		a1.display();
	}
}
	



