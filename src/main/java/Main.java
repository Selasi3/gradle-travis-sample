import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Corporate> corporateclients = List.of(new Corporate("Priscilla","CO001",Service_Level.Gold,"Najat Musah"),
                new Corporate("Bonsu","CO002",Service_Level.Platinum,"Emmma Eshun"),
                new Corporate("Joan","CO003",Service_Level.Premium,"Kelvin Boateng"),
                new Corporate("David","CO004",Service_Level.Gold,"Kwame Asiedu"));
        List<Private> privateClients = List.of(new Private("Solomon","PO001",Service_Level.Gold),
                new Private("Davida","PO002",Service_Level.Premium),
                new Private("Adjei","PO003",Service_Level.Platinum),
                new Private("Winifred","PO004",Service_Level.Premium));

        ClientRegister clientRegister = new ClientRegister(corporateclients,privateClients);
        System.out.println(clientRegister.allClientByServiceLevel());

        System.out.println(clientRegister.allClientByServiceLevel());

    }
}
