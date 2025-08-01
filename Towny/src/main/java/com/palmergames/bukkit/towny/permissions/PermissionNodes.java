package com.palmergames.bukkit.towny.permissions;

/**
 * @author ElgarL
 * 
 */
public enum PermissionNodes {
	/*
	 * Admin-related nodes.
	 */
	TOWNY_ADMIN("towny.admin"),
	TOWNY_ADMIN_NATION_ZONE("towny.admin.nation_zone"),
	TOWNY_ADMIN_OUTLAW_TELEPORT_BYPASS("towny.admin.outlaw.teleport_bypass"),
	TOWNY_ADMIN_TOWN_COMMAND_BLACKLIST_BYPASS("towny.admin.town_commands.blacklist_bypass"),
	TOWNY_ADMIN_TOURIST_COMMAND_LIMITATION_BYPASS("towny.globally_welcome"),
	TOWNY_ADMIN_UPDATEALERTS("towny.admin.updatealerts"),
	TOWNY_CHAT_SPY("towny.chat.spy"),
	TOWNY_BYPASS_DEATH_COSTS("towny.bypass_death_costs"),
	TOWNY_BYPASS_BED_RESTRICTION("towny.bypass_bed_restriction"),
	TOWNY_SPAWN_ADMIN("towny.admin.spawn"),
	TOWNY_SPAWN_ADMIN_NOWARMUP("towny.admin.spawn.nowarmup"),
	TOWNY_SPAWN_ADMIN_NOCOOLDOWN("towny.admin.spawn.nocooldown"),
	TOWNY_SPAWN_ADMIN_NOCHARGE("towny.admin.spawn.nocharge"),

	/*
	 * Misc Nodes.
	 */

	TOWNY_TOWN_RESIDENT("towny.town.resident"),
	TOWNY_OUTLAW_JAILER("towny.outlaw.jailer"),
	TOWNY_RECEIVES_PLOT_NOTIFICATIONS("towny.receives-plot-notifications"),
	
	/*
	 * Nation command permissions
	 */

	TOWNY_COMMAND_NATION("towny.command.nation.*"),
	TOWNY_COMMAND_NATION_LIST("towny.command.nation.list.*"),
	    TOWNY_COMMAND_NATION_LIST_RESIDENTS("towny.command.nation.list.residents"),
	    TOWNY_COMMAND_NATION_LIST_TOWNS("towny.command.nation.list.towns"),
	    TOWNY_COMMAND_NATION_LIST_OPEN("towny.command.nation.list.open"),
	    TOWNY_COMMAND_NATION_LIST_FOUNDED("towny.command.nation.list.founded"),
	    TOWNY_COMMAND_NATION_LIST_PUBLIC("towny.command.nation.list.public"),
	    TOWNY_COMMAND_NATION_LIST_BALANCE("towny.command.nation.list.balance"),
	    TOWNY_COMMAND_NATION_LIST_NAME("towny.command.nation.list.name"),
	    TOWNY_COMMAND_NATION_LIST_TOWNBLOCKS("towny.command.nation.list.townblocks"),
	    TOWNY_COMMAND_NATION_LIST_ONLINE("towny.command.nation.list.online"),
		TOWNY_COMMAND_NATION_LIST_UPKEEP("towny.command.nation.list.upkeep"),
	TOWNY_COMMAND_NATION_TOWNLIST("towny.command.nation.townlist"),
	TOWNY_COMMAND_NATION_ALLYLIST("towny.command.nation.allylist"),
	TOWNY_COMMAND_NATION_ENEMYLIST("towny.command.nation.enemylist"),
	TOWNY_COMMAND_NATION_NEW("towny.command.nation.new"),
	TOWNY_COMMAND_NATION_LEAVE("towny.command.nation.leave"),
	TOWNY_COMMAND_NATION_MERGE("towny.command.nation.merge"),
	TOWNY_COMMAND_NATION_WITHDRAW("towny.command.nation.withdraw"),
	TOWNY_COMMAND_NATION_DEPOSIT("towny.command.nation.deposit"),
	TOWNY_COMMAND_NATION_DEPOSIT_OTHER("towny.command.nation.deposit.other"),
	TOWNY_COMMAND_NATION_OTHERNATION("towny.command.nation.othernation"),
	TOWNY_COMMAND_NATION_JOIN("towny.command.nation.join"),
	TOWNY_COMMAND_NATION_RANKLIST("towny.command.nation.ranklist"),
	TOWNY_COMMAND_NATION_RANK("towny.command.nation.rank.*"), // Covers all assignable ranks

	TOWNY_COMMAND_NATION_LEADER("towny.command.nation.king"),

	TOWNY_COMMAND_NATION_SET("towny.command.nation.set.*"),
		TOWNY_COMMAND_NATION_SET_KING("towny.command.nation.set.king"),
		TOWNY_COMMAND_NATION_SET_CAPITAL("towny.command.nation.set.capital"),
		TOWNY_COMMAND_NATION_SET_TAXES("towny.command.nation.set.taxes"),
		TOWNY_COMMAND_NATION_SET_NAME("towny.command.nation.set.name"),
		TOWNY_COMMAND_NATION_SET_TITLE("towny.command.nation.set.title"),
		TOWNY_COMMAND_NATION_SET_TITLE_COLOUR("towny.command.nation.set.title.colour"),
		TOWNY_COMMAND_NATION_SET_SURNAME("towny.command.nation.set.surname"),
		TOWNY_COMMAND_NATION_SET_TAG("towny.command.nation.set.tag"),
		TOWNY_COMMAND_NATION_SET_BOARD("towny.command.nation.set.board"),
		TOWNY_COMMAND_NATION_SET_SPAWN("towny.command.nation.set.spawn"),
		TOWNY_COMMAND_NATION_SET_SPAWNCOST("towny.command.nation.set.spawncost"),
		TOWNY_COMMAND_NATION_SET_MAPCOLOR("towny.command.nation.set.mapcolor"),
		TOWNY_COMMAND_NATION_SET_TAXPERCENTCAP("towny.command.nation.set.taxpercentcap"),
		TOWNY_COMMAND_NATION_SET_CONQUEREDTAX("towny.command.nation.set.conqueredtax"),

	TOWNY_COMMAND_NATION_TOGGLE("towny.command.nation.toggle.*"),
		TOWNY_COMMAND_NATION_TOGGLE_NEUTRAL("towny.command.nation.toggle.neutral"),
		TOWNY_COMMAND_NATION_TOGGLE_PUBLIC("towny.command.nation.toggle.public"),
		TOWNY_COMMAND_NATION_TOGGLE_OPEN("towny.command.nation.toggle.open"),
		TOWNY_COMMAND_NATION_TOGGLE_TAXPERCENT("towny.command.nation.toggle.taxpercent"),

	TOWNY_COMMAND_NATION_ENEMY("towny.command.nation.enemy"),
	TOWNY_COMMAND_NATION_DELETE("towny.command.nation.delete"),
	TOWNY_COMMAND_NATION_ONLINE("towny.command.nation.online"),
	TOWNY_COMMAND_NATION_SAY("towny.command.nation.say"),
	TOWNY_COMMAND_NATION_BANKHISTORY("towny.command.nation.bankhistory"),
	TOWNY_COMMAND_NATION_BALTOP("towny.command.nation.baltop"),
	TOWNY_COMMAND_NATION_KICK("towny.command.nation.kick"),
	TOWNY_COMMAND_NATION_SANCTIONTOWN("towny.command.nation.sanctiontown"),
	
	/*
	 * Town command permissions
	 */

	TOWNY_COMMAND_TOWN("towny.command.town.*"),
		TOWNY_COMMAND_TOWN_OTHERTOWN("towny.command.town.othertown"),
		TOWNY_COMMAND_TOWN_HERE("towny.command.town.here"),
		TOWNY_COMMAND_TOWN_LIST("towny.command.town.list.*"),
		    TOWNY_COMMAND_TOWN_LIST_RESIDENTS("towny.command.town.list.residents"),
		    TOWNY_COMMAND_TOWN_LIST_OPEN("towny.command.town.list.open"),
		    TOWNY_COMMAND_TOWN_LIST_PUBLIC("towny.command.town.list.public"),
		    TOWNY_COMMAND_TOWN_LIST_BALANCE("towny.command.town.list.balance"),
		    TOWNY_COMMAND_TOWN_LIST_NAME("towny.command.town.list.name"),
		    TOWNY_COMMAND_TOWN_LIST_FOUNDED("towny.command.town.list.founded"),
		    TOWNY_COMMAND_TOWN_LIST_TOWNBLOCKS("towny.command.town.list.townblocks"),
		    TOWNY_COMMAND_TOWN_LIST_ONLINE("towny.command.town.list.online"),
		    TOWNY_COMMAND_TOWN_LIST_RUINED("towny.command.town.list.ruined"),
		    TOWNY_COMMAND_TOWN_LIST_BANKRUPT("towny.command.town.list.bankrupt"),
			TOWNY_COMMAND_TOWN_LIST_UPKEEP("towny.command.town.list.upkeep"),
		TOWNY_COMMAND_TOWN_OUTPOST_LIST("towny.command.town.outpost.list"),
		TOWNY_COMMAND_TOWN_NEW("towny.command.town.new"),
		TOWNY_COMMAND_TOWN_LEAVE("towny.command.town.leave"),
		TOWNY_COMMAND_TOWN_TAKEOVERCLAIM("towny.command.town.takeoverclaim"),
		TOWNY_COMMAND_TOWN_RECLAIM("towny.command.town.reclaim"),
		TOWNY_COMMAND_TOWN_WITHDRAW("towny.command.town.withdraw"),
		TOWNY_COMMAND_TOWN_DEPOSIT("towny.command.town.deposit"),
			TOWNY_COMMAND_TOWN_DEPOSIT_OTHERTOWN("towny.command.town.deposit.othertown"),
		TOWNY_COMMAND_TOWN_PLOTS("towny.command.town.plots"),
		TOWNY_COMMAND_TOWN_PURGE("towny.command.town.purge"),
		TOWNY_COMMAND_TOWN_MERGE("towny.command.town.merge"),
		TOWNY_COMMAND_TOWN_BUY("towny.command.town.buy.*"),
			TOWNY_COMMAND_TOWN_BUY_BONUS("towny.command.town.buy.bonus"),
		TOWNY_COMMAND_TOWN_CEDE("towny.command.town.cede.*"),
			TOWNY_COMMAND_TOWN_CEDE_PLOT("towny.command.town.cede.plot"),
		TOWNY_COMMAND_TOWN_JAIL("towny.command.town.jail"),
		TOWNY_COMMAND_TOWN_JAIL_LIST("towny.command.town.jail.list"),
		TOWNY_COMMAND_TOWN_UNJAIL("towny.command.town.unjail"),
		TOWNY_COMMAND_TOWN_PLOTGROUPLIST("towny.command.town.plotgrouplist"),
		TOWNY_COMMAND_TOWN_TRUST("towny.command.town.trust"),
		TOWNY_COMMAND_TOWN_TRUSTTOWN("towny.command.town.trusttown"),
		TOWNY_COMMAND_TOWN_RANK("towny.command.town.rank.*"), // Covers all assignable ranks
		TOWNY_COMMAND_TOWN_RANKLIST("towny.command.town.ranklist"),
		TOWNY_COMMAND_TOWN_FORSALE("towny.command.town.forsale"),
		TOWNY_COMMAND_TOWN_NOTFORSALE("towny.command.town.notforsale"),
		TOWNY_COMMAND_TOWN_BUYTOWN("towny.command.town.buytown"),
		TOWNY_COMMAND_TOWN_SET("towny.command.town.set.*"),
			TOWNY_COMMAND_TOWN_SET_BOARD("towny.command.town.set.board"),
			TOWNY_COMMAND_TOWN_SET_MAYOR("towny.command.town.set.mayor"),
			TOWNY_COMMAND_TOWN_SET_HOMEBLOCK("towny.command.town.set.homeblock"),
			TOWNY_COMMAND_TOWN_SET_SPAWN("towny.command.town.set.spawn"),
			TOWNY_COMMAND_TOWN_SET_OUTPOST("towny.command.town.set.outpost"),
			TOWNY_COMMAND_TOWN_SET_PRIMARYJAIL("towny.command.town.set.primaryjail"),
			TOWNY_COMMAND_TOWN_SET_PERM("towny.command.town.set.perm"),
			TOWNY_COMMAND_TOWN_SET_TAXES("towny.command.town.set.taxes"),
			TOWNY_COMMAND_TOWN_SET_PLOTTAX("towny.command.town.set.plottax"),
			TOWNY_COMMAND_TOWN_SET_SHOPTAX("towny.command.town.set.shoptax"),
			TOWNY_COMMAND_TOWN_SET_EMBASSYTAX("towny.command.town.set.embassytax"),
			TOWNY_COMMAND_TOWN_SET_SPAWNCOST("towny.command.town.set.spawncost"),
			TOWNY_COMMAND_TOWN_SET_PLOTPRICE("towny.command.town.set.plotprice"),
			TOWNY_COMMAND_TOWN_SET_EMBASSYPRICE("towny.command.town.set.embassyprice"),
			TOWNY_COMMAND_TOWN_SET_SHOPPRICE("towny.command.town.set.shopprice"),
			TOWNY_COMMAND_TOWN_SET_MAPCOLOR("towny.command.town.set.mapcolor"),
			TOWNY_COMMAND_TOWN_SET_NAME("towny.command.town.set.name"),
			TOWNY_COMMAND_TOWN_SET_TAG("towny.command.town.set.tag"),
			TOWNY_COMMAND_TOWN_SET_JAIL("towny.command.town.set.jail"),
			TOWNY_COMMAND_TOWN_SET_TITLE("towny.command.town.set.title"),
			TOWNY_COMMAND_TOWN_SET_TITLE_COLOUR("towny.command.town.set.title.colours"),
			TOWNY_COMMAND_TOWN_SET_SURNAME("towny.command.town.set.surname"),
			TOWNY_COMMAND_TOWN_SET_TAXPERCENTCAP("towny.command.town.set.taxpercentcap"),
		
		TOWNY_COMMAND_TOWN_TOGGLE("towny.command.town.toggle.*"),
			TOWNY_COMMAND_TOWN_TOGGLE_PVP("towny.command.town.toggle.pvp"),
			TOWNY_COMMAND_TOWN_TOGGLE_PUBLIC("towny.command.town.toggle.public"),
			TOWNY_COMMAND_TOWN_TOGGLE_EXPLOSION("towny.command.town.toggle.explosion"),
			TOWNY_COMMAND_TOWN_TOGGLE_FIRE("towny.command.town.toggle.fire"),
			TOWNY_COMMAND_TOWN_TOGGLE_MOBS("towny.command.town.toggle.mobs"),
			TOWNY_COMMAND_TOWN_TOGGLE_TAXPERCENT("towny.command.town.toggle.taxpercent"),
			TOWNY_COMMAND_TOWN_TOGGLE_OPEN("towny.command.town.toggle.open"),
			TOWNY_COMMAND_TOWN_TOGGLE_NEUTRAL("towny.command.town.toggle.neutral"),
			TOWNY_COMMAND_TOWN_TOGGLE_NATIONZONE("towny.command.town.toggle.nationzone"),

		TOWNY_COMMAND_TOWN_MAYOR("towny.command.town.mayor"),
		TOWNY_COMMAND_TOWN_DELETE("towny.command.town.delete"),
		TOWNY_COMMAND_TOWN_JOIN("towny.command.town.join"),
		TOWNY_COMMAND_TOWN_KICK("towny.command.town.kick"),
		
		TOWNY_COMMAND_TOWN_CLAIM("towny.command.town.claim.*"),
			TOWNY_COMMAND_TOWN_CLAIM_TOWN("towny.command.town.claim.town"),
				TOWNY_COMMAND_TOWN_CLAIM_TOWN_MULTIPLE("towny.command.town.claim.town.multiple"),
			TOWNY_COMMAND_TOWN_CLAIM_OUTPOST("towny.command.town.claim.outpost"),
			TOWNY_COMMAND_TOWN_CLAIM_FILL("towny.command.town.claim.fill"),
		
		TOWNY_COMMAND_TOWN_UNCLAIM("towny.command.town.unclaim"),
		TOWNY_COMMAND_TOWN_UNCLAIM_ALL("towny.command.town.unclaim.all"),
		TOWNY_COMMAND_TOWN_ONLINE("towny.command.town.online"),
		TOWNY_COMMAND_TOWN_SAY("towny.command.town.say"),
		TOWNY_COMMAND_TOWN_OUTLAW("towny.command.town.outlaw"),
		TOWNY_COMMAND_TOWN_BANKHISTORY("towny.command.town.bankhistory"),
		TOWNY_COMMAND_TOWN_RESLIST("towny.command.town.reslist"),
		TOWNY_COMMAND_TOWN_OUTLAWLIST("towny.command.town.outlawlist"),
	
	/*
	 * Plot command permissions
	 */
	TOWNY_COMMAND_PLOT("towny.command.plot.*"),
		TOWNY_COMMAND_PLOT_ASMAYOR("towny.command.plot.asmayor"),
		TOWNY_COMMAND_PLOT_ASMAYORINUNOWNED("towny.command.plot.asmayorinunowned"),
		TOWNY_COMMAND_PLOT_CLAIM("towny.command.plot.claim"),
		TOWNY_COMMAND_PLOT_EVICT("towny.command.plot.evict"),
		TOWNY_COMMAND_PLOT_UNCLAIM("towny.command.plot.unclaim"),
		TOWNY_COMMAND_PLOT_NOTFORSALE("towny.command.plot.notforsale"),
		TOWNY_COMMAND_PLOT_FORSALE("towny.command.plot.forsale"),
		TOWNY_COMMAND_PLOT_JAILCELL("towny.command.plot.jailcell"),
		TOWNY_COMMAND_PLOT_TRUST("towny.command.plot.trust"),
		TOWNY_COMMAND_PLOT_PERM("towny.command.plot.perm.*"),
			TOWNY_COMMAND_PLOT_PERM_INFO("towny.command.plot.perm"),
			TOWNY_COMMAND_PLOT_PERM_HUD("towny.command.plot.perm.hud"),
			TOWNY_COMMAND_PLOT_PERM_GUI("towny.command.plot.perm.gui"),
			TOWNY_COMMAND_PLOT_PERM_ADD("towny.command.plot.perm.add"),
			TOWNY_COMMAND_PLOT_PERM_REMOVE("towny.command.plot.perm.remove"),
		
		TOWNY_COMMAND_PLOT_TOGGLE("towny.command.plot.toggle.*"),
			TOWNY_COMMAND_PLOT_TOGGLE_PVP("towny.command.plot.toggle.pvp"),
			TOWNY_COMMAND_PLOT_TOGGLE_EXPLOSION("towny.command.plot.toggle.explosion"),
			TOWNY_COMMAND_PLOT_TOGGLE_FIRE("towny.command.plot.toggle.fire"),
			TOWNY_COMMAND_PLOT_TOGGLE_MOBS("towny.command.plot.toggle.mobs"),
		
		TOWNY_COMMAND_PLOT_SET("towny.command.plot.set.*"),
			TOWNY_COMMAND_PLOT_SET_NAME("towny.command.plot.set.name"),
			TOWNY_COMMAND_PLOT_SET_PERM("towny.command.plot.set.perm"),
			TOWNY_COMMAND_PLOT_SET_RESET("towny.command.plot.set.reset"),
			TOWNY_COMMAND_PLOT_SET_SHOP("towny.command.plot.set.shop"),
			TOWNY_COMMAND_PLOT_SET_EMBASSY("towny.command.plot.set.embassy"),
			TOWNY_COMMAND_PLOT_SET_ARENA("towny.command.plot.set.arena"),
			TOWNY_COMMAND_PLOT_SET_WILDS("towny.command.plot.set.wilds"),
			TOWNY_COMMAND_PLOT_SET_SPLEEF("towny.command.plot.set.spleef"),
			TOWNY_COMMAND_PLOT_SET_INN("towny.command.plot.set.inn"),
			TOWNY_COMMAND_PLOT_SET_JAIL("towny.command.plot.set.jail"),

		TOWNY_COMMAND_PLOT_DISTRICT("towny.command.plot.district.*"),
		TOWNY_COMMAND_PLOT_DISTRICT_ADD("towny.command.plot.district.add"),
		TOWNY_COMMAND_PLOT_DISTRICT_REMOVE("towny.command.plot.district.remove"),
		TOWNY_COMMAND_PLOT_DISTRICT_DELETE("towny.command.plot.district.delete"),
		TOWNY_COMMAND_PLOT_DISTRICT_RENAME("towny.command.plot.district.rename"),

		
		TOWNY_COMMAND_PLOT_GROUP("towny.command.plot.group.*"),
		    TOWNY_COMMAND_PLOT_GROUP_ADD("towny.command.plot.group.add"),
		    TOWNY_COMMAND_PLOT_GROUP_REMOVE("towny.command.plot.group.remove"),
		    TOWNY_COMMAND_PLOT_GROUP_DELETE("towny.command.plot.group.delete"),
		    TOWNY_COMMAND_PLOT_GROUP_RENAME("towny.command.plot.group.rename"),
		    TOWNY_COMMAND_PLOT_GROUP_SET("towny.command.plot.group.set"),
		    TOWNY_COMMAND_PLOT_GROUP_TOGGLE("towny.command.plot.group.toggle"),
		    TOWNY_COMMAND_PLOT_GROUP_FORSALE("towny.command.plot.group.forsale"),
		    TOWNY_COMMAND_PLOT_GROUP_NOTFORSALE("towny.command.plot.group.notforsale"),
			TOWNY_COMMAND_PLOT_GROUP_TRUST("towny.command.plot.group.trust"),
			TOWNY_COMMAND_PLOT_GROUP_PERM("towny.command.plot.group.perm"),
		
		TOWNY_COMMAND_PLOT_CLEAR("towny.command.plot.clear"),
	
	/*
	 * Resident command permissions
	 */
	TOWNY_COMMAND_RESIDENT_OTHERRESIDENT("towny.command.resident.otherresident"),
	TOWNY_COMMAND_RESIDENT_LIST("towny.command.resident.list"),
	TOWNY_COMMAND_RESIDENT_TAX("towny.command.resident.tax"),
	TOWNY_COMMAND_RESIDENT_PLOTLIST("towny.command.resident.plotlist"),
	TOWNY_COMMAND_RESIDENT_OUTLAWLIST("towny.command.resident.outlawlist"),
	TOWNY_COMMAND_RESIDENT_JAIL("towny.command.resident.jail"),
	TOWNY_COMMAND_RESIDENT_SET("towny.command.resident.set.*"),
		TOWNY_COMMAND_RESIDENT_SET_PERM("towny.command.resident.set.perm"),
		TOWNY_COMMAND_RESIDENT_SET_MODE("towny.command.resident.set.mode"),
		TOWNY_COMMAND_RESIDENT_SET_MODE_CLEAR("towny.command.resident.set.mode.clear"),
		TOWNY_COMMAND_RESIDENT_SET_ABOUT("towny.command.resident.set.about"),
	
	TOWNY_COMMAND_RESIDENT_TOGGLE("towny.command.resident.toggle.*"),
		// Plot-permission-related
		TOWNY_COMMAND_RESIDENT_TOGGLE_PVP("towny.command.resident.toggle.pvp"),
		TOWNY_COMMAND_RESIDENT_TOGGLE_EXPLOSION("towny.command.resident.toggle.explosion"),
		TOWNY_COMMAND_RESIDENT_TOGGLE_FIRE("towny.command.resident.toggle.fire"),
		TOWNY_COMMAND_RESIDENT_TOGGLE_MOBS("towny.command.resident.toggle.mobs"),
		// Generic Modes
		TOWNY_COMMAND_RESIDENT_TOGGLE_BEDSPAWN("towny.command.resident.toggle.bedspawn"),
		TOWNY_COMMAND_RESIDENT_TOGGLE_BORDERTITLES("towny.command.resident.toggle.bordertitles"),
		TOWNY_COMMAND_RESIDENT_TOGGLE_IGNOREOTHERCHANNELS("towny.command.resident.toggle.ignoreotherchannels"),
		TOWNY_COMMAND_RESIDENT_TOGGLE_IGNOREPLOTS("towny.command.resident.toggle.ignoreplots"),
		TOWNY_COMMAND_RESIDENT_TOGGLE_INFOTOOL("towny.command.resident.toggle.infotool"),
		TOWNY_COMMAND_RESIDENT_TOGGLE_MAP("towny.command.resident.toggle.map"),
		TOWNY_COMMAND_RESIDENT_TOGGLE_PLOTGROUP("towny.command.resident.toggle.plotgroup"),
		TOWNY_COMMAND_RESIDENT_TOGGLE_DISTRICT("towny.command.resident.toggle.district"),
		TOWNY_COMMAND_RESIDENT_TOGGLE_TOWNBORDER("towny.command.resident.toggle.townborder"),
		// Border Modes
		TOWNY_COMMAND_RESIDENT_TOGGLE_CONSTANTPLOTBORDER("towny.command.resident.toggle.constantplotborder"),
		TOWNY_COMMAND_RESIDENT_TOGGLE_PLOTBORDER("towny.command.resident.toggle.plotborder"),
		// Claiming Modes
		TOWNY_COMMAND_RESIDENT_TOGGLE_TOWNCLAIM("towny.command.resident.toggle.townclaim"),
		TOWNY_COMMAND_RESIDENT_TOGGLE_TOWNUNCLAIM("towny.command.resident.toggle.townunclaim"),
	
	TOWNY_COMMAND_RESIDENT_FRIEND("towny.command.resident.friend"),
	TOWNY_COMMAND_RESIDENT_SPAWN("towny.command.resident.spawn"),	
	
	/*
	 * TownyAdmin command permissions
	 */
	TOWNY_COMMAND_TOWNYADMIN("towny.command.townyadmin.*"),
	TOWNY_COMMAND_TOWNYADMIN_SCREEN("towny.command.townyadmin"),
	TOWNY_COMMAND_TOWNYADMIN_SET("towny.command.townyadmin.set.*"),
		TOWNY_COMMAND_TOWNYADMIN_SET_MAYOR("towny.command.townyadmin.set.mayor"),
		TOWNY_COMMAND_TOWNYADMIN_SET_PLOT("towny.command.townyadmin.set.plot"),
		TOWNY_COMMAND_TOWNYADMIN_SET_CAPITAL("towny.command.townyadmin.set.capital"),
		TOWNY_COMMAND_TOWNYADMIN_SET_FOUNDER("towny.command.townyadmin.set.founder"),
		TOWNY_COMMAND_TOWNYADMIN_SET_TITLE("towny.command.townyadmin.set.title"),
		TOWNY_COMMAND_TOWNYADMIN_SET_SURNAME("towny.command.townyadmin.set.surname"),
		TOWNY_COMMAND_TOWNYADMIN_SET_ABOUT("towny.command.townyadmin.set.about"),
		TOWNY_COMMAND_TOWNYADMIN_SET_NATIONZONE("towny.command.townyadmin.set.nationzoneoverride"),
		
    TOWNY_COMMAND_TOWNYADMIN_PLOT("towny.command.townyadmin.plot.*"),
    	TOWNY_COMMAND_TOWNYADMIN_PLOT_CLAIM("towny.command.townyadmin.plot.claim"),
		TOWNY_COMMAND_TOWNYADMIN_PLOT_META("towny.command.townyadmin.plot.meta"),
		TOWNY_COMMAND_TOWNYADMIN_PLOT_CLAIMEDAT("towny.command.townyadmin.plot.claimedat"),
		TOWNY_COMMAND_TOWNYADMIN_PLOT_TRUST("towny.command.townyadmin.plot.trust"),
	
	TOWNY_COMMAND_TOWNYADMIN_RESIDENT("towny.command.townyadmin.resident.*"),
		TOWNY_COMMAND_TOWNYADMIN_RESIDENT_ABOUT("towny.command.townyadmin.resident.about"),
		TOWNY_COMMAND_TOWNYADMIN_RESIDENT_RENAME("towny.command.townyadmin.resident.rename"),
		TOWNY_COMMAND_TOWNYADMIN_RESIDENT_FRIEND("towny.command.townyadmin.resident.friend"),
		TOWNY_COMMAND_TOWNYADMIN_RESIDENT_META("towny.command.townyadmin.resident.meta"),
		TOWNY_COMMAND_TOWNYADMIN_RESIDENT_UNJAIL("towny.command.townyadmin.resident.unjail"),
		TOWNY_COMMAND_TOWNYADMIN_RESIDENT_DELETE("towny.command.townyadmin.resident.delete"),
		
	TOWNY_COMMAND_TOWNYADMIN_TOWN("towny.command.townyadmin.town.*"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_INVITE("towny.command.townyadmin.town.invite"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_NEW("towny.command.townyadmin.town.new"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_ADD("towny.command.townyadmin.town.add"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_BUY("towny.command.townyadmin.town.buy"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_KICK("towny.command.townyadmin.town.kick"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_DELETE("towny.command.townyadmin.town.delete"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_DEPOSIT("towny.command.townyadmin.town.deposit"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_FORCEMERGE("towny.command.townyadmin.town.forcemerge"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_FORSALE("towny.command.townyadmin.town.forsale"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_NOTFORSALE("towny.command.townyadmin.town.notforsale"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_MERGE("towny.command.townyadmin.town.merge"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_RENAME("towny.command.townyadmin.town.rename"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_TOGGLE("towny.command.townyadmin.town.toggle"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_SET("towny.command.townyadmin.town.set"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_SETTOWNLEVEL("towny.command.townyadmin.town.settownlevel"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_SETFOUNDINGDATE("towny.command.townyadmin.town.set.foundingdate"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_GIVEBOUGHTBLOCKS("towny.command.townyadmin.town.giveboughtblocks"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_SPAWN("towny.command.townyadmin.town.spawn"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_SPAWN_FREECHARGE("towny.command.townyadmin.town.spawn.freecharge"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_OUTLAW("towny.command.townyadmin.town.outlaw"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_OUTPOST("towny.command.townyadmin.town.outpost"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_RANK("towny.command.townyadmin.town.rank"),
	    TOWNY_COMMAND_TOWNYADMIN_TOWN_META("towny.command.townyadmin.town.meta"),
	    TOWNY_COMMAND_TOWNYADMIN_TOWN_BANKHISTORY("towny.command.townyadmin.town.bankhistory"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_TRUST("towny.command.townyadmin.town.trust"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_TRUSTTOWN("towny.command.townyadmin.town.trusttown"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_UNRUIN("towny.command.townyadmin.town.unruin"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_CHECKOUTPOSTS("towny.command.townyadmin.town.checkoutposts"),
		TOWNY_COMMAND_TOWNYADMIN_TOWN_WITHDRAW("towny.command.townyadmin.town.withdraw"),
	
	TOWNY_COMMAND_TOWNYADMIN_NATION("towny.command.townyadmin.nation.*"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_NEW("towny.command.townyadmin.nation.new"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_ADD("towny.command.townyadmin.nation.add"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_DELETE("towny.command.townyadmin.nation.delete"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_DEPOSIT("towny.command.townyadmin.nation.deposit"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_FORCEMERGE("towny.command.townyadmin.nation.forcemerge"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_KICK("towny.command.townyadmin.nation.kick"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_META("towny.command.townyadmin.nation.meta"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_RANK("towny.command.townyadmin.nation.rank"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_RECHECK("towny.command.townyadmin.nation.recheck"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_RENAME("towny.command.townyadmin.nation.rename"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_MERGE("towny.command.townyadmin.nation.merge"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_SANCTIONTOWN("towny.command.townyadmin.nation.sanctiontown"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_SET("towny.command.townyadmin.nation.set"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_SETFOUNDINGDATE("towny.command.townyadmin.nation.set.foundingdate"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_TOGGLE("towny.command.townyadmin.nation.toggle"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_TRANSFER("towny.command.townyadmin.nation.transfer"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_WITHDRAW("towny.command.townyadmin.nation.withdraw"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_BANKHISTORY("towny.command.townyadmin.nation.bankhistory"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_ENEMY("towny.command.townyadmin.nation.enemy"),
		TOWNY_COMMAND_TOWNYADMIN_NATION_ALLY("towny.command.townyadmin.nation.ally"),
	
	TOWNY_COMMAND_TOWNYADMIN_TOGGLE("towny.command.townyadmin.toggle.*"),
		TOWNY_COMMAND_TOWNYADMIN_TOGGLE_DEVMODE("towny.command.townyadmin.toggle.devmode"),
		TOWNY_COMMAND_TOWNYADMIN_TOGGLE_DEBUG("towny.command.townyadmin.toggle.debug"),
		TOWNY_COMMAND_TOWNYADMIN_TOGGLE_NATIONWITHDRAW("towny.command.townyadmin.toggle.nationwithdraw"),
		TOWNY_COMMAND_TOWNYADMIN_TOGGLE_NPC("towny.command.townyadmin.toggle.npc"),
		TOWNY_COMMAND_TOWNYADMIN_TOGGLE_REGENERATIONS("towny.command.townyadmin.toggle.regenerations"),
		TOWNY_COMMAND_TOWNYADMIN_TOGGLE_TOWNWITHDRAW("towny.command.townyadmin.toggle.townwithdraw"),
		TOWNY_COMMAND_TOWNYADMIN_TOGGLE_WILDERNESSUSE("towny.command.townyadmin.toggle.wildernessuse"),
	
	TOWNY_COMMAND_TOWNYADMIN_GIVEBONUS("towny.command.townyadmin.givebonus"),
	TOWNY_COMMAND_TOWNYADMIN_RELOAD("towny.command.townyadmin.reload"),
	TOWNY_COMMAND_TOWNYADMIN_MYSQLDUMP("towny.command.townyadmin.mysqldump"),
	TOWNY_COMMAND_TOWNYADMIN_DATABASE("towny.command.townyadmin.database"),
	TOWNY_COMMAND_TOWNYADMIN_RESET("towny.command.townyadmin.reset"),
	TOWNY_COMMAND_TOWNYADMIN_BACKUP("towny.command.townyadmin.backup"),
	TOWNY_COMMAND_TOWNYADMIN_NEWDAY("towny.command.townyadmin.newday"),
	TOWNY_COMMAND_TOWNYADMIN_NEWHOUR("towny.command.townyadmin.newhour"),
	TOWNY_COMMAND_TOWNYADMIN_PURGE("towny.command.townyadmin.purge"),
	TOWNY_COMMAND_TOWNYADMIN_CHECKPERM("towny.command.townyadmin.checkperm"),
	TOWNY_COMMAND_TOWNYADMIN_CHECKOUTPOSTS("towny.command.townyadmin.checkoutposts"),
	TOWNY_COMMAND_TOWNYADMIN_UNCLAIM("towny.command.townyadmin.unclaim"),
	TOWNY_COMMAND_TOWNYADMIN_RESIDNET_DELETE("towny.command.townyadmin.resident.delete"),
	TOWNY_COMMAND_TOWNYADMIN_ECO("towny.command.townyadmin.eco.*"),
	TOWNY_COMMAND_TOWNYADMIN_ECO_DEPOSITALL("towny.command.townyadmin.eco.depositall"),
	TOWNY_COMMAND_TOWNYADMIN_ECO_DEPOSITALLTOWNS("towny.command.townyadmin.eco.depositalltowns"),
	TOWNY_COMMAND_TOWNYADMIN_ECO_DEPOSITALLNATIONS("towny.command.townyadmin.eco.depositallnations"),
	TOWNY_COMMAND_TOWNYADMIN_ECO_RESETBANKS("towny.command.townyadmin.eco.resetbanks"),
	TOWNY_COMMAND_TOWNYADMIN_ECO_CONVERT("towny.command.townyadmin.eco.convert"),
	TOWNY_COMMAND_TOWNYADMIN_ECO_INFO("towny.command.townyadmin.eco.info"),
	TOWNY_COMMAND_TOWNYADMIN_TOWNYPERMS("towny.command.townyadmin.townyperms"),
	TOWNY_COMMAND_TOWNYADMIN_TPPLOT("towny.command.townyadmin.tpplot"),
	TOWNY_COMMAND_TOWNYADMIN_INSTALL("towny.command.townyadmin.install"),
	
	/*
	 * Towny command permissions
	 */
	TOWNY_COMMAND_TOWNY("towny.command.towny.*"),
	TOWNY_COMMAND_TOWNY_MAP("towny.command.towny.map"),
	TOWNY_COMMAND_TOWNY_TOP("towny.command.towny.top.*"),
		TOWNY_COMMAND_TOWNY_TOP_RESIDENTS("towny.command.towny.top.residents"),
		TOWNY_COMMAND_TOWNY_TOP_LAND("towny.command.towny.top.land"),
		TOWNY_COMMAND_TOWNY_TOP_BALANCE("towny.command.towny.top.balance"),
	TOWNY_COMMAND_TOWNY_TREE("towny.command.towny.tree"),
	TOWNY_COMMAND_TOWNY_TIME("towny.command.towny.time"),
	TOWNY_COMMAND_TOWNY_UNIVERSE("towny.command.towny.universe"),
	TOWNY_COMMAND_TOWNY_VERSION("towny.command.towny.version"),
	
	/*
	 * TownyWorld command permissions
	 */
	TOWNY_COMMAND_TOWNYWORLD_LIST("towny.command.townyworld.list"),
	TOWNY_COMMAND_TOWNYWORLD_SET("towny.command.townyworld.set"),
	TOWNY_COMMAND_TOWNYWORLD_TOGGLE("towny.command.townyworld.toggle.*"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_CLAIMABLE("towny.command.townyworld.toggle.claimable"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_USINGTOWNY("towny.command.townyworld.toggle.usingtowny"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_WARALLOWED("towny.command.townyworld.toggle.warallowed"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_PVP("towny.command.townyworld.toggle.pvp"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_FORCEPVP("towny.command.townyworld.toggle.forcepvp"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_EXPLOSION("towny.command.townyworld.toggle.explosion"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_FORCEEXPLOSION("towny.command.townyworld.toggle.forceexplosion"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_FIRE("towny.command.townyworld.toggle.fire"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_FORCEFIRE("towny.command.townyworld.toggle.forcefire"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_FRIENDLYFIRE("towny.command.townyworld.toggle.friendlyfire"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_TOWNMOBS("towny.command.townyworld.toggle.townmobs"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_WORLDMOBS("towny.command.townyworld.toggle.worldmobs"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_WILDERNESSMOBS("towny.command.townyworld.toggle.wildernessmobs"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_REVERTUNCLAIM("towny.command.townyworld.toggle.revertunclaim"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_REVERTEXPL("towny.command.townyworld.toggle.revertexpl"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_REVERTENTITYEXPL("towny.command.townyworld.toggle.revertentityexpl"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_REVERTBLOCKEXPL("towny.command.townyworld.toggle.revertblockexpl"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_PLOTCLEARDELETE("towny.command.townyworld.toggle.plotcleardelete"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_UNCLAIMBLOCKDELETE("towny.command.townyworld.toggle.unclaimblockdelete"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_UNCLAIMENTITYDELETE("towny.command.townyworld.toggle.unclaimentitydelete"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_WILDERNESSUSE("towny.command.townyworld.toggle.wildernessuse"),
		TOWNY_COMMAND_TOWNYWORLD_TOGGLE_JAILING("towny.command.townyworld.toggle.jailing"),

	/*
	 * Towns Spawning Nodes.
	 */

	TOWNY_SPAWN_ALL("towny.town.spawn.*"),
		TOWNY_SPAWN_TOWN("towny.town.spawn.town"),
		TOWNY_SPAWN_OUTPOST("towny.town.spawn.outpost"),
		TOWNY_SPAWN_NATION("towny.town.spawn.nation"),
			TOWNY_SPAWN_NATION_BYPASS_PUBLIC("towny.town.spawn.nation.bypass_public"),
		TOWNY_SPAWN_ALLY("towny.town.spawn.ally"),
			TOWNY_SPAWN_ALLY_BYPASS_PUBLIC("towny.town.spawn.ally.bypass_public"),
		TOWNY_SPAWN_PUBLIC("towny.town.spawn.public"),

	/*
	 * Nation spawnings nodes.
	 */

	TOWNY_NATION_SPAWN_ALL("towny.nation.spawn.*"),
		TOWNY_NATION_SPAWN_NATION("towny.nation.spawn.nation"),
		TOWNY_NATION_SPAWN_ALLY("towny.nation.spawn.ally"),
		TOWNY_NATION_SPAWN_PUBLIC("towny.nation.spawn.public"),

	/*
	 * Wilderness protection nodes.
	 */

	TOWNY_WILD_ALL("towny.wild.*"),
		TOWNY_WILD_BLOCK_BUILD("towny.wild.build.*"),
		TOWNY_WILD_BLOCK_DESTROY("towny.wild.destroy.*"),
		TOWNY_WILD_BLOCK_SWITCH("towny.wild.switch.*"),
		TOWNY_WILD_BLOCK_ITEM_USE("towny.wild.item_use.*"),

	/*
	 * Claimed area override nodes.
	 */

	TOWNY_CLAIMED_ALL("towny.claimed.*"),
		TOWNY_CLAIMED_ALLTOWN_ALL("towny.claimed.alltown.*"),
			TOWNY_CLAIMED_ALLTOWN_BLOCK_BUILD("towny.claimed.alltown.build.*"),
			TOWNY_CLAIMED_ALLTOWN_BLOCK_DESTROY("towny.claimed.alltown.destroy.*"),
			TOWNY_CLAIMED_ALLTOWN_BLOCK_SWITCH("towny.claimed.alltown.switch.*"),
			TOWNY_CLAIMED_ALLTOWN_BLOCK_ITEM_USE("towny.claimed.alltown.item_use.*"),
		TOWNY_CLAIMED_OWNTOWN_ALL("towny.claimed.owntown.*"),
			TOWNY_CLAIMED_OWNTOWN_BLOCK_BUILD("towny.claimed.owntown.build.*"),
			TOWNY_CLAIMED_OWNTOWN_BLOCK_DESTROY("towny.claimed.owntown.destroy.*"),
			TOWNY_CLAIMED_OWNTOWN_BLOCK_SWITCH("towny.claimed.owntown.switch.*"),
			TOWNY_CLAIMED_OWNTOWN_BLOCK_ITEM_USE("towny.claimed.owntown.item_use.*"),
		TOWNY_CLAIMED_TOWNOWNED_ALL("towny.claimed.townowned.*"),
			TOWNY_CLAIMED_TOWNOWNED_BLOCK_BUILD("towny.claimed.townowned.build.*"),
			TOWNY_CLAIMED_TOWNOWNED_BLOCK_DESTROY("towny.claimed.townowned.destroy.*"),
			TOWNY_CLAIMED_TOWNOWNED_BLOCK_SWITCH("towny.claimed.townowned.switch.*"),
			TOWNY_CLAIMED_TOWNOWNED_BLOCK_ITEM_USE("towny.claimed.townowned.item_use.*"),

	/*
	 * Invites system
	 */

	// Towns invite residents.
	TOWNY_COMMAND_TOWN_INVITE_SEE_HOME("towny.command.town.invite"),
	TOWNY_COMMAND_TOWN_INVITE_ADD("towny.command.town.invite.add"),
	TOWNY_COMMAND_TOWN_INVITE_ADD_MULTIPLE("towny.command.town.invite.add.multiple"),
	TOWNY_COMMAND_TOWN_INVITE_LIST_SENT("towny.command.town.invite.sent"),
	TOWNY_COMMAND_TOWN_INVITE_LIST_RECEIVED("towny.command.town.invite.received"),
	TOWNY_COMMAND_TOWN_INVITE_ACCEPT("towny.command.town.invite.accept"),
	TOWNY_COMMAND_TOWN_INVITE_DENY("towny.command.town.invite.deny"),
	// Nations invite towns.
	TOWNY_COMMAND_NATION_INVITE_SEE_HOME("towny.command.nation.invite"),
	TOWNY_COMMAND_NATION_INVITE_ADD("towny.command.nation.invite.add"),
	TOWNY_COMMAND_NATION_INVITE_LIST_SENT("towny.command.nation.invite.sent"),
	// Nations invite allies. 
	TOWNY_COMMAND_NATION_ALLY("towny.command.nation.ally.*"),
		TOWNY_COMMAND_NATION_ALLY_ACCEPT("towny.command.nation.ally.accept"),
		TOWNY_COMMAND_NATION_ALLY_DENY("towny.command.nation.ally.deny"),
		TOWNY_COMMAND_NATION_ALLY_ADD("towny.command.nation.ally.add"),
		TOWNY_COMMAND_NATION_ALLY_REMOVE("towny.command.nation.ally.remove"),
		TOWNY_COMMAND_NATION_ALLY_LIST_SENT("towny.command.nation.ally.sent"),
		TOWNY_COMMAND_NATION_ALLY_LIST_RECEIVED("towny.command.nation.ally.received"),

	/*
	 * Info/Option nodes (gotten via Vault Chat.)
	 */

	TOWNY_DEFAULT_MODES("towny_default_modes"),
	TOWNY_MAX_PLOTS("towny_maxplots"),
	TOWNY_EXTRA_PLOTS("towny_extraplots"),
	TOWNY_MAX_OUTPOSTS("towny_maxoutposts");

	private String value;

	/**
	 * Constructor
	 * 
	 * @param permission - Permission.
	 */
	PermissionNodes(String permission) {

		this.value = permission;
	}

	/**
	 * Retrieves the permission node
	 * 
	 * @return The permission node
	 */
	public String getNode() {

		return value;
	}

	/**
	 * Retrieves the permission node
	 * replacing the character *
	 * 
	 * @param replace - String
	 * @return The permission node
	 */
	public String getNode(String replace) {

		return value.replace("*", replace);
	}

	public String getNode(int replace) {

		return value.replace("*", replace + "");
	}
}
