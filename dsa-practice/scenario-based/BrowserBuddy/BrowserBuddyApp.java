package scenario_based.BrowserBuddy;

public class BrowserBuddyApp {
    public static void main(String[] args) {

        BrowserBuddy browser = new BrowserBuddy();
        Tab tab = browser.getActiveTab();

        tab.visit("google.com");
        tab.visit("github.com");
        tab.visit("stackoverflow.com");

        tab.back();
        tab.back();
        tab.forward();

        browser.closeTab();
        browser.restoreTab();

        System.out.println("Current Page: " + browser.getActiveTab().getCurrentPage());
    }
}
