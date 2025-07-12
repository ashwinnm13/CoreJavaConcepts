//This is an entity class used to demonstrate Encapsulation
package Day8;

public class User 
{
     private String username;
     private String password;
	
     public User()
     {
		super();
		username = "Unknown";
		password = "null";
	}

	public User(String username, String password) 
	{
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	
	public void setPassword(String password)
	{
		if (isValidPassword(password)) 
		{
            this.password = password;
        } 
		else 
		{
            System.out.println("Password must be at least 8 characters and contain a number.");
        }
	}
	
	//LOGIN PASSWORD CHECKING
	public boolean login(String password) 
	{
        return this.password.equals(password);
    }
	
    //PASSWORD LENGTH CHECKER
	private boolean isValidPassword(String pwd)
	{
	    return pwd.length() >= 8 && pwd.matches(".*\\d.*");
	}
      
}
