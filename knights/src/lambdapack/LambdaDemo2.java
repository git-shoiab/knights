package lambdapack;
//https://fluvid.com/videos/detail/ODe_5Cv6MgtxZqV4X#.YmQOdiW3Glc.link
public class LambdaDemo2 {
	public static void main(String[] args) {
		//Old way
		Exporter e=new ExporterImpl();
		e.doExport();
		met(e);
		
		//anonymous implementation
		Exporter exp=new Exporter() {			
			@Override
			public void doExport() {
				System.out.println("anonumous logic....");
			}
		};
		exp.doExport();
		met(exp);
		
		//Lambda
		Exporter exp2=()->{System.out.println("do export logic written here..lambda way.");};
		exp2.doExport();
		met(exp2);
		
		//Importer imp=(s,m)->{System.out.println("do import...:"+s+":"+m);};
		Importer imp=(String s,int m)->{System.out.println("do import...:"+s+":"+m);};
		imp.doImport("knights..", 101010);
	}
	
	static void met(Exporter ex) {
		ex.doExport();
	}
}

@FunctionalInterface
interface Exporter{
	public void doExport();
}

class ExporterImpl implements Exporter{
	@Override
	public void doExport() {
		System.out.println("do export implemented..old way.");
	}
}

interface Importer{
	public void doImport(String name,int money);
}