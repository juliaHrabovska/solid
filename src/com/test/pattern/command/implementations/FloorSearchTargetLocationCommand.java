package com.test.pattern.command.implementations;

import com.test.entity.TargetLocation;
import com.test.entity.TransferRequest;
import com.test.pattern.command.SearchTargetLocationCommand;

public class FloorSearchTargetLocationCommand extends SearchTargetLocationCommand {
    @Override
    public TargetLocation searchAndAssignTargetLocation(TransferRequest transferRequest) {
        // searching TL in another floor
        return null;
    }
}
