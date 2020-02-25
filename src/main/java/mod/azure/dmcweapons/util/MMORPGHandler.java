package mod.azure.dmcweapons.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

import mod.azure.dmcweapons.config.Config;

public class MMORPGHandler {

	public MMORPGHandler() {
		MineAndSlashAPI.addCompatibleItem("dmcweapons:rebellion", new ConfigItem().setType(Sword.INSTANCE)
				.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		MineAndSlashAPI.addCompatibleItem("dmcweapons:redqueen", new ConfigItem().setType(Sword.INSTANCE)
				.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		MineAndSlashAPI.addCompatibleItem("dmcweapons:spada", new ConfigItem().setType(Sword.INSTANCE)
				.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		MineAndSlashAPI.addCompatibleItem("dmcweapons:yamato", new ConfigItem().setType(Sword.INSTANCE)
				.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		MineAndSlashAPI.addCompatibleItem("dmcweapons:coyote-a", new ConfigItem().setType(Bow.INSTANCE)
				.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
	}
}