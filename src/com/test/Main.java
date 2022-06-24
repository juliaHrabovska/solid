package com.test;

import com.test.entity.Animal;
import com.test.entity.TransferRequest;
import com.test.pattern.SearchTargetLocationCommandContainer;
import com.test.pattern.command.SearchTargetLocationCommand;

import java.util.Arrays;

import static com.test.pattern.TransferRequestCase.BUILDING;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(1, "Rack 1, Cage 2");

        TransferRequest transferRequest = new TransferRequest()
                .setId(1)
                .setAnimals(Arrays.asList(animal))
                .setRelocationType(BUILDING);

        SearchTargetLocationCommand searchTargetLocationCommand = SearchTargetLocationCommandContainer.get(BUILDING);
        searchTargetLocationCommand.searchAndAssignTargetLocation(transferRequest);

        // do movement and verify that animals have new location
    }

}
