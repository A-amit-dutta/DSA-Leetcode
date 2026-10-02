class Node{
    String val;
    Node next;
    Node prev;
    Node(String val){
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}

class BrowserHistory {

    Node current = null;
    public BrowserHistory(String homepage) {
        current = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        current.next = newNode;
        newNode.prev = current;
        current = current.next;
    }
    
    public String back(int steps) {
        while(steps>0){
            if(current.prev != null)
                current = current.prev;
            else
                break;
            steps--;
        }
        return current.val;
    }
    
    public String forward(int steps) {
        while(steps>0){
            if(current.next != null)
                current = current.next;
            else
                break;
            steps--;
        }
        return current.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */