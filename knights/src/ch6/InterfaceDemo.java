package ch6;
//https://fluvid.com/videos/detail/DrG-KszLVnH-1gnpo#.YiYZsxaAEE0.link
public class InterfaceDemo {
	public static void main(String[] args) {
		Human1 shoiab=new Human1();//1974
		
		AlopathyMedicalCollege stanley=new AlopathyMedicalCollege();//1834
		UnaniMedicalCollege anna=new UnaniMedicalCollege();//1643
		
		//To make shoiab a doctor, shoiab should subject himself 
		
		
		
	}
}
//Role or interface
interface Doctor{
	public void doCure();
}
//Role 2
interface Nurse{
	public void doCare();
}
//Role Player or Actor - subjected 
class Human1{
	
}
//implementation class
class AlopathyMedicalCollege implements Doctor,Nurse{
	@Override
	public void doCure() {
		System.out.println("do cure implemented as per alopathy medicine....");
	}	
	@Override
	public void doCare() {
		System.out.println("nurse job created as per alopathy care...");
	}
}

class UnaniMedicalCollege implements Doctor{
	@Override
	public void doCure() {
		System.out.println("do cure implemented as per unani medicine...");
	}
}