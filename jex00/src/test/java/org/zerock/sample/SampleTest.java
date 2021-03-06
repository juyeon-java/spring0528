package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class SampleTest {
	@Setter(onMethod_ = {@Autowired})
	private Restraurant restraurant;
	
	@Test
	public void testExist() {
		assertNotNull(restraurant);
		
		log.info(restraurant);
		log.info("-----------------------");
		log.info(restraurant.getChef());
	}
}
