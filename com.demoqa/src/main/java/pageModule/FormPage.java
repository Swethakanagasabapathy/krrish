package pageModule;

import base.Drivermanager;
import base.Wrapper;
import webElement.Form_xpath;

public class FormPage extends Drivermanager{
	public static Wrapper wrap=new Wrapper();
	public static void form() {
		Form_xpath formxp=new Form_xpath(driver);
		wrap.fluentWait(driver, formxp.form_Menu);
		wrap.scrollByElements(driver, formxp.form_Menu);
		wrap.CLICK(driver,formxp.form_Menu );
		System.out.println("form menu click");
		}

	public void practiseform(String fn,String mn) {
		Form_xpath formxp=new Form_xpath(driver);
		wrap.fluentWait(driver, formxp.Practiceform_Menu);
		wrap.scrollByElements(driver, formxp.Practiceform_Menu);
		wrap.CLICK(driver,formxp.Practiceform_Menu );
		System.out.println("Practiceform_Menu click");
		wrap.fluentWait(driver, formxp.Practiceform_Firstname);
		wrap.SENDKEYS(driver, formxp.Practiceform_Firstname, fn);
		wrap.SENDKEYS(driver, formxp.Practiceform_Lastname, "kanagasabapathy");
		wrap.scrollByElements(driver, formxp.Practiceform_Useremail);
		wrap.SENDKEYS(driver, formxp.Practiceform_Useremail, "abc@gmail.com");
		wrap.CLICK(driver,formxp.Practiceform_Genderfemale);
		wrap.scrollByElements(driver, formxp.Practiceform_Mobilenumber);
        wrap.SENDKEYS(driver, formxp.Practiceform_Mobilenumber, mn);
		wrap.scrollByElements(driver, formxp.Practiceform_Sports);
		wrap.CLICK(driver,formxp.Practiceform_Sports);
		wrap.SENDKEYS(driver, formxp.Practiceform_CurrentAddress, "west street");
		
		
	}
}
