package com.xposed.briscriptx.server.script;

import android.graphics.Rect;
import android.util.Log;

import com.xposed.briscriptx.server.SuShellService;
import com.xposed.briscriptx.utils.NodeScriptUtils;

import java.util.List;
import java.util.Map;

public class LoginActivityScript extends BaseScript {
    private static final String TAG = "LoginActivityScript";

    @Override
    public void onCreate(SuShellService suShellService, List<SuShellService.UiXmlParser.Node> nodes) {
        Map<String, SuShellService.UiXmlParser.Node> nodeMap = NodeScriptUtils.toResourceIdMap(nodes);


    }

}
