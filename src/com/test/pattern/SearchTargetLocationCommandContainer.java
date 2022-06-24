package com.test.pattern;

import com.test.pattern.command.implementations.BuildingSearchTargetLocationCommand;
import com.test.pattern.command.implementations.FloorSearchTargetLocationCommand;
import com.test.pattern.command.implementations.RackSearchTargetLocationCommand;
import com.test.pattern.command.implementations.RoomSearchTargetLocationCommand;
import com.test.pattern.command.SearchTargetLocationCommand;

import java.util.HashMap;
import java.util.Map;

import static com.test.pattern.TransferRequestCase.FLOOR;
import static com.test.pattern.TransferRequestCase.RACK;
import static com.test.pattern.TransferRequestCase.ROOM;
import static com.test.pattern.TransferRequestCase.BUILDING;

public class SearchTargetLocationCommandContainer {
    private static final Map<String, SearchTargetLocationCommand> COMMANDS = new HashMap<>();

    static {
        COMMANDS.put(RACK, new RackSearchTargetLocationCommand());
        COMMANDS.put(ROOM, new RoomSearchTargetLocationCommand());
        COMMANDS.put(BUILDING, new BuildingSearchTargetLocationCommand());
        COMMANDS.put(FLOOR, new FloorSearchTargetLocationCommand());
    }

    public static SearchTargetLocationCommand get(String commandName) {
        if (commandName == null || !COMMANDS.containsKey(commandName)) {
            throw new IllegalArgumentException("No relocation type with name " + commandName);
        }

        return COMMANDS.get(commandName);
    }
}
