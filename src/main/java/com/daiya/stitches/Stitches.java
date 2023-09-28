package com.daiya.stitches;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stitches implements ModInitializer {
	public static final String MOD_ID = "stitches";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Applying Stitches To Your Game!");
	}
}