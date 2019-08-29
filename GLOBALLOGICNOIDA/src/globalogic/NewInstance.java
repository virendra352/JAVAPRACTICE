package globalogic;

public class NewInstance {
  public void find() {
	  System.out.println("invoke the instance method");
  }
  
  public static void main(String[] args) throws InstantiationException, IllegalAccessException {
	try {
		Class  c= Class.forName("globalogic.NewInstance");
		
		NewInstance p=(NewInstance) c.newInstance();
		p.find();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		//System.out.println("successfully");
	}
	
}
}
