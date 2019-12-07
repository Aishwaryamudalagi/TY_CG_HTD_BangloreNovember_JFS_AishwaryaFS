
public class Employee1
{
	int empId;
	String empName;
	public Employee1(int empID,String empName)
	{
		this.empId=empId;
		this.empName=empName;
		
	}
	public boolean equals(Object obj)
	{
		Employee1 e1=(Employee1)obj;
		if(e1.empId==this.empId)
		{
			if(e1.empName.equals(this.empName))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	else
			{
				return false;
			}
		}
	}


