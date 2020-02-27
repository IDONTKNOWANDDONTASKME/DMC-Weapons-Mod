package mod.azure.dmcweapons.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.robertx22.mine_and_slash.config.compatible_items.OldConfigItem;
import com.robertx22.mine_and_slash.data_generation.compatible_items.CompatibleItem;
import com.robertx22.mine_and_slash.data_generation.compatible_items.CompatibleItemProvider;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;
import com.robertx22.mine_and_slash.onevent.data_gen.providers.SlashDataProvider;

import mod.azure.dmcweapons.config.Config;
import net.minecraft.data.DataGenerator;

public class MMORPGHandler {

	public static String ID = "compatible_items";

	public MMORPGHandler() {
	}

	@SuppressWarnings("rawtypes")
	public SlashDataProvider getDataPackCreator(DataGenerator gen) {
		return new CompatibleItemProvider(gen, getList(), ID);
	}

	public static List<CompatibleItem> getList() {
		List<String> SWORDS = Stream.of("dmcweapons:rebellion", "dmcweapons:redqueen", "dmcweapons:spada",
				"dmcweapons:devilsworddante", "dmcweapons:yamato").collect(Collectors.toList());

		List<String> GUNS = Stream.of("dmcweapons:coyotea", "dmcweapons:ivory", "dmcweapons:ebony",
				"dmcweapons:kalinaann1", "dmcweapons:kalinaann2").collect(Collectors.toList());

		List<CompatibleItem> items = new ArrayList<>();
		try {
			for (int type = 1; type <= 1; type++)
				switch (type) {
				case 1:
					for (String name : SWORDS) {
						OldConfigItem config = new OldConfigItem().setGenerationWeights(1000, 200, 0).setMaxRarity(5)
								.setMinRarity(0).setSalvagable(true).setType(Sword.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id = name;

						CompatibleItem neww = config.convertToNewFormat();
						neww.guid = id;
						neww.item_id = id;

						items.add(neww);
					}
				case 2:
					for (String name : GUNS) {
						OldConfigItem bowconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0).setMaxRarity(5)
								.setMinRarity(0).setSalvagable(true).setType(Bow.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id2 = name;

						CompatibleItem bow = bowconfig.convertToNewFormat();
						bow.guid = id2;
						bow.item_id = id2;

						items.add(bow);
						break;
					}
				}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return items;
	}

}