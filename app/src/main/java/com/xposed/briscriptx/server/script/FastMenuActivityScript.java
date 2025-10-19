package com.xposed.briscriptx.server.script;

import android.graphics.Rect;
import android.util.Log;

import com.xposed.briscriptx.server.SuShellService;
import com.xposed.briscriptx.utils.NodeScriptUtils;

import java.util.List;
import java.util.Map;

public class FastMenuActivityScript extends BaseScript {
    private static final String TAG = "FastMenuActivityScript";

    @Override
    public void onCreate(SuShellService suShellService, List<SuShellService.UiXmlParser.Node> nodes) {
        Map<String, SuShellService.UiXmlParser.Node> nodeMap = NodeScriptUtils.toResourceIdMap(nodes);
        for (SuShellService.UiXmlParser.Node node : nodeMap.values()) {
            Log.d(TAG, node.toString());
        }
        if (nodeMap.containsKey("id.co.bri.brimo:id/2131362262")) {
            Rect rect = nodeMap.get("id.co.bri.brimo:id/2131362262").getBounds();
            suShellService.click(rect);
        }
    }
}
