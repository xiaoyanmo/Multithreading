package controller;

import java.util.logging.Logger;

//本类模拟成一个Servlet组件
public class LoginServlet {

    private static String usernameRef;
    private static String passwordRef;


//	 public static void doPost(String username, String password) {
//		try {
//			usernameRef = username;
//			if (username.equals("a")) {
//				Thread.sleep(5000);
//			}
//			passwordRef = password;
//
//			Logger.getGlobal().info("username=" + usernameRef + " password="
//					+ password);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//	}

    synchronized public static void doPost(String username, String password) {
        try {
            usernameRef = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;

            Logger.getGlobal().info("username=" + usernameRef + " password="
                    + password);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
    }

}
