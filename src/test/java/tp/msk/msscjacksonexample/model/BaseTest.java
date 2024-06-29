package tp.msk.msscjacksonexample.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {
    BeerDTO getBeerDto(){
        return BeerDTO.builder()
                .beerId(UUID.randomUUID())
                .beerName("beerName")
                .beerStyle("ALE")
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .price(new BigDecimal("12.99"))
                .upc(123123123L)
                .build();
    }
}
