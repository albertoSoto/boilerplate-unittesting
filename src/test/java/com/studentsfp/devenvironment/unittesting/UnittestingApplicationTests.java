package com.studentsfp.devenvironment.unittesting;

import com.studentsfp.devenvironment.unittesting.data.Virus;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class UnittestingApplicationTests {

    @Test
    void contextLoads() {
		String place = "La Mancha";
        String message = String.format("En un lugar de %s de cuyo nombre no me acuerdo...",place);
        Assert.doesNotContain(message, place+".", "¡Quijote te mienten con la provincia!");
    }

    @Test
    void virusCreationTest(){
        Virus virus = new Virus("COVID-19",false);
        Virus virus1 = new Virus();
        Assert.isTrue(!virus.isLetal(),"El virus no puede ser letal de inicio");
    }
}
