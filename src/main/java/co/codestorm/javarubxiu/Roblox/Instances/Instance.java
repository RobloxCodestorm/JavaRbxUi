package co.codestorm.javarubxiu.Roblox.Instances;

import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.TwoArgFunction;

public class Instance extends LuaValue {
    protected RBXScriptSignal[] signals;

    protected boolean Archivable;
    public static final String ClassName = "Instance";
    protected String Name;
    protected Instance Parent;
    protected boolean RobloxLocked;

    public Instance() {
        this.Archivable = true;
        this.Name = "Instance";
        this.Parent = null;
        this.RobloxLocked = false;
    }

    public int type() {
        return 0;
    }

    public String typename() {
        return null;
    }

    public LuaValue get(String key) {
        if (key.equals("Archivable")) {
            return LuaBoolean.valueOf(this.Archivable);
        } else if (key.equals("ClassName")) {
            return LuaString.valueOf(this.ClassName);
        } else if (key.equals(("Name"))) {
            return LuaString.valueOf(this.Name);
        } else if (key.equals("Parent")) {
            return (this.Parent == null) ? NIL : this.Parent;
        } else if (key.equals("RobloxLocked")) {
            return LuaBoolean.valueOf(this.RobloxLocked);
        } else {
            return NIL;
        }
    }

    @Override
    public void set(String key, LuaValue value) {
        if (key.equals(("Archivable"))) {
            this.Archivable = value.toboolean();
        } else if (key.equals("Name")) {
            this.Name = value.toString();
        } else if (key.equals("Parent")) {
            this.Parent = (value.isnil()) ? null : (Instance) value;
        }
    }

}
