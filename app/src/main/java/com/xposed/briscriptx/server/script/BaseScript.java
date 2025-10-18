package com.xposed.briscriptx.server.script;

import com.xposed.briscriptx.server.SuShellService;

import java.util.List;

public abstract class BaseScript {
    public abstract void onCreate(List<SuShellService.UiXmlParser.Node> nodes);
}
