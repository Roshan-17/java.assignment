interface Taskable
{
	// Default method
	default void task(){
		System.out.println("hello");
	}
	
		
	//Abstract method
	void taskMore(String msg);
}

 class DefaultMethod implements Taskable
{
	public void taskMore(String msg)
	{             //implementing abstract method
	System.out.println(msg);
	}

	public static void main(String[] args)
	{
	DefaultMethod dm = new DefaultMethod();
	dm.task();   //calling default method
	dm.taskMore("Task is completed");  //calling abstract method
	}
}