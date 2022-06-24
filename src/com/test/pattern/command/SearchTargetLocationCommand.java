package com.test.pattern.command;

import com.test.entity.Animal;
import com.test.entity.TargetLocation;
import com.test.entity.TransferRequest;

import java.util.stream.Collectors;

public abstract class SearchTargetLocationCommand {
    protected TransferRequest transferRequest;

    public abstract TargetLocation searchAndAssignTargetLocation(TransferRequest transferRequest);

    protected String getOriginLocation() {
        return transferRequest.getAnimals().get(0).getLocation();
    }

    protected TargetLocation prepareTargetLocation(Long targetRackId, Long targetCageId) {
        return new TargetLocation(
                targetCageId,
                targetRackId,
                transferRequest.getAnimals().stream().map(Animal::getId).collect(Collectors.toList())
        );
    }
}
