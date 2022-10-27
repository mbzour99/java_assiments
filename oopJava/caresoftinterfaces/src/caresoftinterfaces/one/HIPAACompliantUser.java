package caresoftinterfaces.one;

public interface HIPAACompliantUser {
    abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
    abstract boolean assignPIN(Integer pin);
    
}

