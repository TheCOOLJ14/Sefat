package net.thecoolj14.sefat;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sefat implements ModInitializer {
	public static final String MOD_ID = "sefat";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Sefat.LOGGER.info("Registering Sefat");
		Sefat.LOGGER.info("Finished Registering Sefat");
	}
}