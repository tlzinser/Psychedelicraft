/*
 *  Copyright (c) 2014, Lukas Tenbrink.
 *  * http://lukas.axxim.net
 */

package ivorius.psychedelicraftcore;

import cpw.mods.fml.common.eventhandler.EventBus;
import ivorius.psychedelicraftcoreUtils.events.WakeUpPlayerEvent;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by lukas on 21.02.14.
 */
public class PsycheCoreBusCommon
{
    public static final EventBus EVENT_BUS = new EventBus();

    public static void wakeUpPlayer(EntityPlayer player, boolean unsuccessful, boolean updateAllPlayersSleepingFlag, boolean setSpawnChunk)
    {
        EVENT_BUS.post(new WakeUpPlayerEvent(player, unsuccessful, updateAllPlayersSleepingFlag, setSpawnChunk));
    }
}