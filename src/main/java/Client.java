public abstract  class Client {
    private String name;
    private String ID;
    private Service_Level level;

    public Client(String name, String ID, Service_Level level) {
        this.name = name;
        this.ID = ID;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }


    public Service_Level getLevel() {
        return level;
    }
    public abstract String  getContactName();
}
