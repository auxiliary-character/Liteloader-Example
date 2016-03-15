package com.example.examplemod;

import java.io.File;

import com.mumfrey.liteloader.LiteMod;
import com.mumfrey.liteloader.modconfig.ConfigStrategy;
import com.mumfrey.liteloader.modconfig.ExposableOptions;

@ExposableOptions(strategy = ConfigStrategy.Versioned, filename="examplemod.json")
public class LiteModExample implements LiteMod {

    public LiteModExample() {
    }

    @Override
    public String getName() {
        return "Example Mod";
    }

    @Override
    public String getVersion()
    {
        return "1.0";
    }

    @Override
    public void init(File configPath) {}

    @Override
    public void upgradeSettings(String version, File configPath, File oldConfigPath) {}

}
