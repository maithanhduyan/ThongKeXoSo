/**
 * @author Mai Thành Duy An
 *
 */
package com.tkxs.commandline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ImportDataCommandLineRunner implements CommandLineRunner{
	
	private static final Logger LOG = LoggerFactory.getLogger(ImportDataCommandLineRunner.class);

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		LOG.info("Command Line Runner...");
	}

}
