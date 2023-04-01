package pojoclasses;

public class UserLibrary {

	//Step 1: Declare all variables in the body globally
	private String name;
	private String job;
		
	//Step 2: Create parameterized constructor to initialize these variables
	public UserLibrary(String name, String job) {
		//super();
		this.name = name;
		this.job = job;
	}
	
	//Step 3: Generate getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
}
