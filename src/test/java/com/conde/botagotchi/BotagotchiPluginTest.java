package com.conde.botagotchi;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class BotagotchiPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(BotagotchiPlugin.class);
		RuneLite.main(args);
	}
}