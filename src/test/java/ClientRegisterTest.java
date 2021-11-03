import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ClientRegisterTest {

   List<Corporate> corporateclients = List.of(new Corporate("Priscilla","CO001",Service_Level.Gold,"Najat Musah"),
                                              new Corporate("Bonsu","CO002",Service_Level.Platinum,"Emmma Eshun"),
                                              new Corporate("Joan","CO003",Service_Level.Premium,"Kelvin Boateng"),
                                              new Corporate("David","CO004",Service_Level.Gold,"Kwame Asiedu"));
   List<Private> privateClients = List.of(new Private("Solomon","PO001",Service_Level.Gold),
                                          new Private("Davida","PO002",Service_Level.Premium),
                                          new Private("Adjei","PO003",Service_Level.Platinum),
                                            new Private("Winifred","PO004",Service_Level.Premium));

   ClientRegister clientRegister = new ClientRegister(corporateclients,privateClients);



   @Test
   public void totalClientsTest(){
       int expectednumber = 8;
      int totalclients = clientRegister.totalClients().size();
      assertTrue(expectednumber==totalclients);

   }

   @Test
   public void contactNameTest(){
      Client client1 = new Corporate("Priscilla","CO001",Service_Level.Gold,"Najat Musah");
      String expectedresult = "Najat Musah";
      String contactName = client1.getContactName();
      assertEquals(expectedresult,contactName);

   }

   @Test
   public void getGoldClientContactTest(){
     List<String> expected = List.of("Najat Musah","Kwame Asiedu","Solomon");
     assertEquals(clientRegister.getGoldClients(),expected);
   }
@Test
   public void getClientNameByIDTest(){
      String expected = "Priscilla";
      String actual = clientRegister.getClientNameByID("CO001");
      assertEquals(expected,actual);

   }

   @Test
   public void getLevelCountTest(){
      Map<String, Long> counting = new HashMap<>();
      counting.put("Platinum", 2l);

      counting.put("Premium",3l);
      counting.put("Gold", 3l);


      assertEquals(counting,clientRegister.allClientByServiceLevel());

   }

}