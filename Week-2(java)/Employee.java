class Employee{
	public int eNo;
	public String eName;
	Employee(int eNo,String eName)
		{
			this.eNo= eNo;
			this.eName = eName;
		}
		public void display()
		{
		System.out.println("regNo : "+eNo);
		System.out.println("name is  : "+eName);
		}
	public static void main(String [] args)
	{
		Employee s1 = new Employee(101,"vicky");
		Employee s2 = new Employee(102,"rocky");
		s1.display();
		s2.display();
	}
}