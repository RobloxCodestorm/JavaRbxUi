package co.codestorm.javarubxiu.Roblox;

import co.codestorm.javarubxiu.Roblox.Instances.Instance;
import co.codestorm.javarubxiu.Roblox.Instances.RBXScriptConnection;
import co.codestorm.javarubxiu.Roblox.Instances.RBXScriptSignal;
import co.codestorm.javarubxiu.Roblox.LuaBinds.LuaInstance;
import org.luaj.vm2.LuaValue;

public final class LuaGlobals {
    private LuaGlobals() {}

    public static LuaValue Types[] = {
            new Instance(),
            // new RBXScriptConnection(),
            // new RBXScriptSignal(),
    };

    public static LuaValue Binds[] = {
            new LuaInstance()
    };

}
