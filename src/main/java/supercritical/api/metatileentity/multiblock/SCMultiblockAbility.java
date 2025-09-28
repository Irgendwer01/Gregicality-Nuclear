package supercritical.api.metatileentity.multiblock;

import static gregtech.api.metatileentity.multiblock.MultiblockAbility.ability;

import net.minecraftforge.items.IItemHandlerModifiable;

import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import supercritical.api.capability.ICoolantHandler;
import supercritical.api.capability.IFuelRodHandler;
import supercritical.common.metatileentities.multi.multiblockpart.MetaTileEntityControlRodPort;

@SuppressWarnings("InstantiationOfUtilityClass")
public class SCMultiblockAbility {

    public static final MultiblockAbility<IFuelRodHandler> IMPORT_FUEL_ROD = ability("import_fuel_rod",
            IFuelRodHandler.class);
    public static final MultiblockAbility<IItemHandlerModifiable> EXPORT_FUEL_ROD = ability("export_fuel_rod",
            IItemHandlerModifiable.class);
    public static final MultiblockAbility<ICoolantHandler> IMPORT_COOLANT = ability("import_coolant",
            ICoolantHandler.class);
    public static final MultiblockAbility<ICoolantHandler> EXPORT_COOLANT = ability("export_coolant",
            ICoolantHandler.class);
    public static final MultiblockAbility<MetaTileEntityControlRodPort> CONTROL_ROD_PORT = ability("control_rod_port",
            MetaTileEntityControlRodPort.class);
}
