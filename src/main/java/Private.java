public class Private extends  Client{
    public Private(String name, String ID, Service_Level level) {
        super(name, ID, level);
    }

    @Override
    public String getContactName() {
        return super.getName();
    }


}
