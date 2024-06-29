package tp.msk.msscjacksonexample.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest{

    @Test
    void testKebab() throws JsonProcessingException {
        BeerDTO beerDTO = getBeerDto();

        String jsonBeerDto = objectMapper.writeValueAsString(beerDTO);

        System.out.println(jsonBeerDto);
    }
}
