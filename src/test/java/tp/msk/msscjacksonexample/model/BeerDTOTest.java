package tp.msk.msscjacksonexample.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDTOTest extends BaseTest{

    @Test
    void testSerializeDto() throws JsonProcessingException {

        BeerDTO beerDTO = getBeerDto();

        String jsonString = objectMapper.writeValueAsString(beerDTO);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {
        String json = "{\"beerId\":\"26285fcb-b392-4870-8ec7-69875f92596d\",\"beerName\":\"beerName\",\"beerStyle\":\"ALE\",\"upc\":123123123,\"price\":12.99,\"createdDate\":\"2024-06-29T15:59:17.9012965+01:00\",\"lastUpdatedDate\":\"2024-06-29T15:59:17.9012965+01:00\"}";

        BeerDTO beerDTO = objectMapper.readValue(json, BeerDTO.class);

        System.out.println(beerDTO);
    }
}