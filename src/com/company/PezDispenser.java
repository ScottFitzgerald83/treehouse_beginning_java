package com.company;

class PezDispenser {
    public static final int MAX_PEZ = 12;
    private final String characterName;
    private int pezCount;

    public PezDispenser(String characterName) {
        this.characterName = characterName;
        pezCount = 0;
    }

    public void fill() {
        pezCount = MAX_PEZ;
    }

    public boolean isEmpty() {
        return pezCount == 0;
    }

    public String getCharacterName() {
        return characterName;
    }

    public boolean dispense() {
        boolean wasDispensed = false;
        if (!isEmpty()) {
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }
}