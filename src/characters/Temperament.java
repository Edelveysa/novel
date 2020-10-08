package characters;


enum Temperament {
    PHLEGMATIC(false, true),
    MELANHOLIC(false, false),
    SANGUINE(true, true),
    CHOLERIC(true, false);

    private String codeCharacter;
    private boolean codeActive;
    private boolean codeColdMind;


    Temperament(boolean codeActive, boolean codeColdMind){
        this.codeActive = codeActive;
        this.codeColdMind = codeColdMind;
    }

    boolean getCodeActive(){
        return codeActive;
    }

    boolean getCodeColdMind(){
        return codeColdMind;
    }

}
