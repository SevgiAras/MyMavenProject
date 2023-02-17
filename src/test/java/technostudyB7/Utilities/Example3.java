package technostudyB7.Utilities;

public class Example3 extends UtilityClass{
    public static void main(String[] args) {


        /** Navigate to https://www.phptravels.net
         * Click on Account button
         * Click on Customer Sign Up
         * Fill the form
         * Check the "I am not robot" check box
         * Click on Sign Up button
         * Check if the title is "Login - PHPTRAVELS"
         * Enter same login information that you used during registration and click login
         * Verify the welcome message contains the first name that you used during registration then close the browser
         *
         * Note: You can use any locator you want.
         * */

        UtilityClass utilityClass=new UtilityClass();
       driver.get("https://www.phptravels.net");


    }
}
