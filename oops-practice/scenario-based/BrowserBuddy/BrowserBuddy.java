package scenario_based.BrowserBuddy;

import java.util.Stack;

class BrowserBuddy {
    private Tab activeTab;
    private Stack<Tab> closedTabs;

    BrowserBuddy() {
        activeTab = new Tab();
        closedTabs = new Stack<>();
    }

    public Tab getActiveTab() {
        return activeTab;
    }

    // Close current tab
    public void closeTab() {
        closedTabs.push(activeTab);
        activeTab = new Tab();
        System.out.println("Tab closed!");
    }

    // Restore last closed tab
    public void restoreTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to restore!");
        } else {
            activeTab = closedTabs.pop();
            System.out.println("Tab restored!");
        }
    }
}

