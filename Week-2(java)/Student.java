class Student{
	public int regNo;
	public String name;
	Student(int regNo,String name)
		{
			this.regNo= regNo;
			this.name = name;
		}
		public void display()
		{
			System.out.println("regNo : "+ regNo);
			System.out.println("name is  : "+name);
		}
	public static void main(String [] args)
	{
		Student s1 = new Student(101,"vicky");
		Student s2 = new Student(102,"rocky");
		s1.display();
		s2.display();
	}
}