package kata4.model;

public class Mail {
    
    String mail;
    
    public Mail (String mail) {
        this.mail=mail;
    }
    
    public String getDomain() {
        return this.mail.substring(this.mail.lastIndexOf("@")+1);
    }
    
}
