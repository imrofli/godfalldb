package org.imrofli.godfall;

import org.imrofli.godfall.helpers.DataHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GodfallApplication implements ApplicationRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(GodfallApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GodfallApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
			for(String s : args.getNonOptionArgs()){
				DataHelper.setDatasetPath(s);
			}

		}
	}
