package ch6;
//https://fluvid.com/videos/detail/37jwQhOVBvSy1azeQ#.YhY9e4tPCY0.link
public class VariableDemo4 {
	public static void main(String[] args) {
		TrainingRoom netaji=new TrainingRoom();
		TrainingRoom betaji=new TrainingRoom();
		
		System.out.println(netaji.sanyo+":"+betaji.sanyo);
		System.out.println(netaji.toilet+":"+betaji.toilet);
		System.out.println(TrainingRoom.toilet+":"+TrainingRoom.toilet);
	}
}

class TrainingRoom{
	Projector sanyo=new Projector();//INSTANCE VARIABLE
	static Toilet toilet=new Toilet();//CLASS VARIABLE
}

class Projector{
	
}

class Toilet{
	
}