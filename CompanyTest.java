import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    Company company1;
    User client1, client2, client3,  seller1, seller2;
    public CompanyTest(){
        company1 = new Company();
    }
    @Test
    public void testConstructor(){
        assertNotNull(company1.getClients());
        assertNotNull(company1.getSellers());
    }
    @Test
    public void testRegisterClient(){
        assertTrue(company1.registerClient(client1));
    }
    @Test
    public void testRegisterClients(){
        assertTrue(company1.registerClient(client1));
        assertTrue(company1.registerClient(client2));
    }
    @Test
    public void testRegisterClientDuplicate(){
        assertTrue(company1.registerClient(client1));
        assertFalse(company1.registerClient(client1));
    }
    @Test
    public void testRegisterClientNull(){
        assertFalse(company1.registerClient(client3));
    }
    @BeforeEach
    void setUp() {
        this.client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        this.client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        this.seller1 = new User("Fernando Fernandes","966777101","fefe@remax.pt");
        this.seller2 = new User("Rodrigo Rodrigues","966777152","roro@remax.pt");
    }

    @AfterEach
    void tearDown() {
    }
}