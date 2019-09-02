package mod.azure.dmcweapons.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Bow;
import com.robertx22.database.gearitemslots.Staff;
import com.robertx22.database.gearitemslots.Sword;

import net.minecraftforge.fml.common.Loader;

public class MMORPGHandler {

	public MMORPGHandler() {
		MineAndSlashAPI.addCompatibleItem("dmcweapons:devilsworddante", new ConfigItem().setType(new Sword()));
		MineAndSlashAPI.addCompatibleItem("dmcweapons:rebellion", new ConfigItem().setType(new Sword()));
		MineAndSlashAPI.addCompatibleItem("dmcweapons:redqueen", new ConfigItem().setType(new Sword()));
		MineAndSlashAPI.addCompatibleItem("dmcweapons:yamato", new ConfigItem().setType(new Sword()));
		MineAndSlashAPI.addCompatibleItem("dmcweapons:spada", new ConfigItem().setType(new Sword()));
		MineAndSlashAPI.addCompatibleItem("dmcweapons:coyote-a", new ConfigItem().setType(new Bow()));
	}
}
