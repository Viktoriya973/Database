package zhuko.v;
import java.util.List;
import java.util.ArrayList;

public class Database {
	private List<Student> list = new ArrayList<Student>();
	
	public Database()
	{
		
	}
	public void addStudent(Student s)
	{
		list.add(s);
	}
	
	public void vypis()
	{
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		
	}
	public void removeStudent(int id)
	{
		list.remove(id);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Database other = (Database) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Database [list=" + list + "]";
	}

}
