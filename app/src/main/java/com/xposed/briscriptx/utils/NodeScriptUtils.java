package com.xposed.briscriptx.utils;

import com.xposed.briscriptx.server.SuShellService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NodeScriptUtils {
    public static Map<String, SuShellService.UiXmlParser.Node> toResourceIdMap(List<SuShellService.UiXmlParser.Node> nodes) {
        Map<String, SuShellService.UiXmlParser.Node> nodeMap = new HashMap<>();
        for (SuShellService.UiXmlParser.Node node : nodes) {
            nodeMap.put(node.getResourceId(), node);
        }
        return nodeMap;
    }

    public static Map<String, SuShellService.UiXmlParser.Node> toTextMap(List<SuShellService.UiXmlParser.Node> nodes) {
        Map<String, SuShellService.UiXmlParser.Node> nodeMap = new HashMap<>();
        for (SuShellService.UiXmlParser.Node node : nodes) {
            nodeMap.put(node.getText(), node);
        }
        return nodeMap;
    }
}
