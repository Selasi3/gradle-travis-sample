import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClientRegister {
    private List<Corporate> corporates;
    private List<Private> privates;


    //  List<Client> clients = new ArrayList<>();
    public ClientRegister(List<Corporate> corporates, List<Private> privates) {
        this.corporates = corporates;
        this.privates = privates;
    }

    public List<Client> totalClients(){
        return Stream.concat(corporates.stream(),privates.stream()).collect(Collectors.toList());
    }

    public List<String> getGoldClients(){
        return totalClients().stream().filter(s->s.getLevel()==Service_Level.Gold).map(s->s.getContactName()).collect(Collectors.toList());
    }

    public String getClientNameByID(String ID){
        String value = totalClients().stream().filter(s->s.getID()==ID).map(s->s.getName()).findAny().orElse("");
        return value;
    }

    public Map<Service_Level, Long> allClientByServiceLevel(){
        return  totalClients().stream().collect(Collectors.groupingBy(s->s.getLevel(),Collectors.counting()));
    }






}
