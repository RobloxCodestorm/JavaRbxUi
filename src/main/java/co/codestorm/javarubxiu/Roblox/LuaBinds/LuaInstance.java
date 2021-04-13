package co.codestorm.javarubxiu.Roblox.LuaBinds;

import co.codestorm.javarubxiu.Roblox.Instances.Instance;
import org.luaj.vm2.LuaError;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.TwoArgFunction;

public class LuaInstance extends TwoArgFunction {
    static LuaTable Library = new LuaTable();

    public LuaValue call(LuaValue modname, LuaValue env) {
        Library = tableOf();

        // library.set( "sinh", new sinh() );
        // library.set( "cosh", new cosh() );

        // Library.rawset(LuaValue.INDEX, Library);

        Library.set("new", new constructor());

        env.set("Instance", Library);
        return Library;
    }

    static class constructor extends TwoArgFunction {
        public LuaValue call(LuaValue Arg1, LuaValue Arg2) {
            LuaString ClassName;
            Instance Parent;

            try {
                ClassName = (LuaString) Arg1;
                Parent = (Instance) Arg2;
            } catch (Exception ignored) {
                return NIL;
            }



            return NIL;
        }
    }

}