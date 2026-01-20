package scenario_based.BrowserBuddy;

class Tab {
    private PageNode current;

    // Visit new page
    public void visit(String url) {
        PageNode newPage = new PageNode(url);

        if (current != null) {
            current.next = newPage;
            newPage.prev = current;
        }
        current = newPage;
        System.out.println("Visited: " + url);
    }

    // Go back
    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No previous page!");
        }
    }

    // Go forward
    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No forward page!");
        }
    }

    public String getCurrentPage() {
        return current != null ? current.url : "Empty Tab";
    }
}
