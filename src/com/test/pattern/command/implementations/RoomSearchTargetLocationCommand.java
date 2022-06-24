package com.test.pattern.command.implementations;

import com.test.entity.TargetLocation;
import com.test.entity.TransferRequest;
import com.test.pattern.command.SearchTargetLocationCommand;

public class RoomSearchTargetLocationCommand extends SearchTargetLocationCommand {
    @Override
    public TargetLocation searchAndAssignTargetLocation(TransferRequest transferRequest) {
        super.transferRequest = transferRequest;

        // some logic for searching target location

        return prepareTargetLocation(1L, 1L);
    }
}
