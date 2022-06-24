package com.test.entity;

import java.util.List;

public class TargetLocation {
    private Long targetCageId;
    private Long targetRackId;
    private List<Integer> taskIds;

    public TargetLocation(Long targetCageId, Long targetRackId, List<Integer> taskIds) {
        this.targetCageId = targetCageId;
        this.targetRackId = targetRackId;
        this.taskIds = taskIds;
    }
}
