public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String getFirstName(String name) {

		String firstName = name.trim().substring(0, name.trim().indexOf(" "));
		
		return firstName;
	}

	public static String getLastName(String name) {

		String lastName = name.trim().substring(name.trim().lastIndexOf(" ")+1);
		
		return lastName;
	}

	public static Boolean isValidName(String name) {

		Boolean validName = name.trim().contains(" ") && name.trim().substring(0,name.trim().indexOf(" ")).length()>=2 && name.trim().substring(name.trim().lastIndexOf(" ")+1).length()>=2 && !name.trim().replaceFirst(" ", "").contains(" ");
		
		return validName;
	}
}

