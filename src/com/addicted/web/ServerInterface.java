package com.addicted.web;

public class ServerInterface {
	
	//TODO Finish help, add license file
	public static String help = "com.addicted.web.ServerInterface help \n(c) 2010 Tyler Kirkham \n" +
			"This work is licensed under the GNU GPL v3 or later. Please consult the included " +
			"license file for more information. \n\n" +
			"The following arguments must be supplied in the following order to provide " +
			"functionality:\n" +
			"\t Database type: a String, either \"MySQL\" or \"PostreSQL\" (no quotes). " +
			"Note: ASCII encoding is not supported.\n" +
			"\t Username: a String containing the username used to gain access to the database.\n" +
			"\t Password: a String containging the password of the user.\n" +
			"\t Database name: a String of the name of the database to connect to.\n" +
			"\t Hostname: a String of the IP or URI address of the database (localhost, " +
			"www.anyhost.com, 175.203.10.191, etc.).\n" +
			"\t Port: an Integer of the port on which the database is listening.\n" +
			"\t Log file path and name: the path";

	/**
	 * @param args 1. Database type (Either MySQL or PostgreSQL, IllegalArgumentException will be thrown if other
	 * name is supplied. Capitalization does not matter, but other spellings will be rejected) 2. Username 
	 * 3. Password 4. Database Name 5. Hostname 6. Port 7. Log file path and name
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length < 5) {
			if(args.length == 0) System.out.print(help);
			throw new IllegalArgumentException("Too few arguments supplied");
		} else if(!args[0].equalsIgnoreCase("MySQL")||!args[0].equalsIgnoreCase("PostgreSQL")) {
			throw new IllegalArgumentException("Invalid database type entered! Please check spelling or ");
		}
	}

}
