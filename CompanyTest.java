import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    Company company1;
    public CompanyTest(){
        company1 = new Company();
    }
    @Test
    public void testConstructor(){
        assertNotNull(company1.getClients());
        assertNotNull(company1.getSellers());
    }
    @BeforeEach
    void setUp() {
        User client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        User client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        User seller1 = new User("Fernando Fernandes","966777101","fefe@remax.pt");
        User seller2 = new User("Rodrigo Rodrigues","966777152","roro@remax.pt");
    }

    @AfterEach
    void tearDown() {
    }
}