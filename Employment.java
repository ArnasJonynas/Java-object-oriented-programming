class Employment {
 
 private Project prj;
 private double Salary;
 private String Position;
 private int Hours;
 
 public void Employment(){
	 prj = new Project();
 }
 
 public void setValues ( Project aprv, double asalary, String aPosition, int ahours){
	prj = aprv;
	Salary = asalary;
	Position = aPosition;
	Hours = ahours;
 }
public void setprj(Project prj){
     this.prj=prj;
}
public void setSalary(double Salary){
     this.Salary=Salary;
}
public void setPosition(String Position){
     this.Position=Position;
}
public void setHours(int Hours){
     this.Hours=Hours;
}
public Project getprj(){
 return prj;
}
 public double getSalary(){
	 return Salary;
 }
 public String getPosition(){
	 return Position;
 }
 public int getHours(){
	 return Hours;
 }
 public double getMonthlySalary(){
	 visalga+=salary;
	 return visalga;
}