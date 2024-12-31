package My_Package.O1.com;

public class ParentClass {
  public void  loadingClass(String className) throws ClassNotFoundException
  {
	  Class.forName(className);     
  }
}
/*public class ParentClass {

public void loadingClass(String className) throws ClassNotFoundException {
	Class c =  Class.forName(className);
}

}
*/