public class Corporate extends Client{
    private String Account_Manager;

    public Corporate(String name, String ID, Service_Level level, String account_Manager) {
        super(name, ID, level);
        Account_Manager = account_Manager;
    }


    public String getAccount_Manager() {
        return Account_Manager;
    }

    @Override
    public String getContactName() {
        return this.Account_Manager;
    }
}
