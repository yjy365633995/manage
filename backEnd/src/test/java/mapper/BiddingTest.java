package mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nari.ProcurementBiddingApplication;
import org.nari.mapper.BiddingMapper;
import org.nari.model.Bidding;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProcurementBiddingApplication.class)
public class BiddingTest {
    @Resource
    BiddingMapper biddingMapper;

    @Test
    public void testSearch(){
        String biddingId = null;
        Date date =new Date();
        String material_code = "";
        String material_name = "";

        List<Bidding> list = biddingMapper.searchBiddings(biddingId,date,material_code,material_name);

        list.forEach(System.out::println);
    }
}
